#from datetime import datetime, timedelta
import datetime
from collections import namedtuple

class Reservations:
    def __init__(self):
        self._NUM_MACHINES = 12
        self._machines = [[] for i in range(self._NUM_MACHINES)] # Initializes an array of empty arrays
        self._waiting = []

    def add(self, newReservation):
        for machine in self._machines:
            if not machine:
                machine.append(newReservation)
                return False
            if not self._checkOverlap(newReservation, machine):
                machine.append(newReservation)
                return False
        return True

    def remove(self, oldReservation):
        for reservations in self._machines:
            if oldReservation in reservations:
                reservations.remove(oldReservation)
                self._checkWaitingList()
                return True
        return False

    def addWaiting(self, reservation):
        self._waiting.append(reservation)

    def removeWaiting(self, reservation):
        if reservation in self._waiting:
            self._waiting.remove(reservation)
            return True
        return False

    def getReservations(self):
        temp = []
        for reservations in self._machines:
            for reservation in reservations:
                temp.append(reservation)
        return temp

    def getWaitings(self):
        return self._waiting

    def _checkWaitingList(self):
        for waitingReservation in self._waiting:
            self.add(waitingReservation)
            self.removeWaiting(waitingReservation)
            print('Reservation canceled. Adding pending reservation, and contacting user.')

    def _checkOverlap(self, newReservation, reservations):
        if not newReservation or not reservations:
            return False

        newReservationStart = self._getReservationStart(newReservation)
        newReservationEnd = self._getReservationEnd(newReservation, newReservationStart)

        for reservation in reservations: # checks if reservations overlap each other
            reservationStart = self._getReservationStart(reservation)
            reservationEnd = self._getReservationEnd(reservation, reservationStart)

            Range = namedtuple('Range', ['start', 'end'])
            r1 = Range(start=newReservationStart, end=newReservationEnd)
            r2 = Range(start=reservationStart, end=reservationEnd)

            latest_start = max(r1.start, r2.start)
            earliest_end = min(r1.end, r2.end)
            delta = (earliest_end - latest_start).days + 1
            overlap = max(0, delta)
            if overlap > 0:
                return True
        return False

    def _getReservationYear(self, reservation):
        return int(reservation.get('date')[:4])

    def _getReservationMonth(self, reservation):
        return self._dateToNumber(reservation.get('label').split()[2])

    def _getReservationDay(self, reservation):
        return int(reservation.get('label').split()[1])

    def _getReservationDate(self, reservation):
        return datetime.date(
            self._getReservationYear(reservation),
            self._getReservationMonth(reservation),
            self._getReservationDay(reservation),
        )

    def _getReservationStart(self, reservation):
        return datetime.datetime(
            self._getReservationYear(reservation),                  # year
            self._getReservationMonth(reservation),                 # month
            self._getReservationDay(reservation),                   # day
            int(reservation.get('label').split()[3].split(":")[1]), # hour
            int(reservation.get('label').split()[3].split(":")[2]), # minutes
            0
        )
    
    def _getReservationEnd(self, reservation, reservationStart):
        washDuration = -1
        if reservation.get('program') == 'boilWash': washDuration = 90
        elif reservation.get('program') == 'clothWash': washDuration = 60
        elif reservation.get('program') == 'handWash': washDuration = 20
        else: print('Error: unrecognized program: ', reservation.get('program'))
        return reservationStart + datetime.timedelta(minutes=washDuration)

    def _dateToNumber(self, date):
        if date == 'Januar': return 1
        elif date == 'Februar': return 2
        elif date == 'Mars': return 3
        elif date == 'April': return 4
        elif date == 'Mai': return 5
        elif date == 'Juli': return 6
        elif date == 'Juni': return 7
        elif date == 'August': return 8
        elif date == 'September': return 9
        elif date == 'Oktober': return 10
        elif date == 'November': return 11
        elif date == 'Desember': return 12
        else: print('Error: date was: ', date)
