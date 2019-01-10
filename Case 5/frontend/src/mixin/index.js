export default {
  getDay (date) {
    let day = ''
    if (date.getDay() === 1) {
      day = 'Mandag'
    } else if (date.getDay() === 2) {
      day = 'Tirsdag'
    } else if (date.getDay() === 3) {
      day = 'Onsdag'
    } else if (date.getDay() === 4) {
      day = 'Torsdag'
    } else if (date.getDay() === 5) {
      day = 'Fredag'
    } else if (date.getDay() === 6) {
      day = 'Lørdag'
    } else if (date.getDay() === 0) {
      day = 'Søndag'
    }
    return day
  },
  getMonth (date) {
    let month = ''
    if (date.getMonth() === 0) {
      month = 'Januar'
    } else if (date.getMonth() === 1) {
      month = 'Februar'
    } else if (date.getMonth() === 2) {
      month = 'Mars'
    } else if (date.getMonth() === 3) {
      month = 'April'
    } else if (date.getMonth() === 4) {
      month = 'Mai'
    } else if (date.getMonth() === 5) {
      month = 'Juni'
    } else if (date.getMonth() === 6) {
      month = 'Juli'
    } else if (date.getMonth() === 7) {
      month = 'August'
    } else if (date.getMonth() === 8) {
      month = 'September'
    } else if (date.getMonth() === 9) {
      month = 'Oktober'
    } else if (date.getMonth() === 10) {
      month = 'November'
    } else if (date.getMonth() === 11) {
      month = 'Desember'
    }
    return month
  }
}
