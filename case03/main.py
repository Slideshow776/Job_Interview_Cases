"""
Acquires data from a local json file and sends these as transactions to Google Analytics

@date: May 2018
@author: Sandra Moen
"""

import http.client, urllib, json, uuid, sys

class google_analytics:
    def __init__(self):
        self._open_connection('www.google-analytics.com')
        self._get_tracking_id()        

    def _open_connection(self, url):
        try: self.connection = http.client.HTTPConnection(url)
        except Exception as e:   
            print('Error connecting to: ' + url, e)
            sys.exit()
    
    def _get_tracking_id(self):
        try:
            file_with_tracking_id_in_it = open('tracking_id.txt', 'r')
            self.tracking_id = file_with_tracking_id_in_it.readline()
            file_with_tracking_id_in_it.close()
        except Exception as e:
            print('Error loading the tracking id: Make sure tracking_id.txt containing a valid tracking id is in the same folder as this script.', e)
            sys.exit()

    def _send_request(self, params):
        try: self.connection.request(method='POST', url='/collect', body=params)
        except Exception as e:
            print('Error with request:', e)
            return
        return self.connection.getresponse().read() # Note that you must have read the whole response before you can send a new request to the server.

    def close_connection(self): 
        self.connection.close()

    def send_transaction(self, sku, category, name, series, 
        price, currency, transaction_id):

        """
        Ecommerce Tracking (https://developers.google.com/analytics/devguides/collection/protocol/v1/devguide#ecom)
         To send ecommerce data, send one transaction hit to represent an entire transaction,
         then send an item hit for each item in the transaction. 
         The transaction ID ti links all the hits together to represent the entire purchase.
        """

        cid = uuid.uuid4() # Universally unique identifier

        # transaction ---------------------------------------------------------------------------
        params = urllib.parse.urlencode({
            'v':        1,                  # Version.
            't':        'transaction',      # Transaction hit type.
            'tid':      self.tracking_id,   # Tracking ID / Property ID.
            'cid':      cid,                # Anonymous Client ID.

            'ti':       transaction_id,     # Transaction ID. Required.
            'ta':       'RedPerformance'    # Transaction affiliation.
        })
        #print('\ntransaction: params: ', params)        
        self._send_request(params)

        # item ----------------------------------------------------------------------------------
        params = urllib.parse.urlencode({
            'v':        1,                  # Version.
            't':        'item',             # Transaction hit type.
            'tid':      self.tracking_id,   # Tracking ID / Property ID.
            'cid':      cid,                # (Universally unique identifier) Anonymous Client ID.

            'ic':       sku,                # Item code / SKU.
            'iv':       category,           # Item variation / category.
            'in':       name,               # Item name. Required.
            'series':   series,             # Item series
            'ip':       price,              # Item price.
            'iq':       1,                  # Item quantity.
            'cu':       currency,           # Currency code.
            'ti':       transaction_id      # Transaction ID. Required.
        })
        #print('item: params: ', params)
        self._send_request(params)
    

def main():
    googleAnalytics = google_analytics()
    try: json_data = json.load(open('fabfurniture.json'))
    except Exception as e:
            print('Error loading the transaction data: Make sure fabfurniture.json containing valid transactions is in the same folder as this script.', e)
            sys.exit()
    for data in json_data:
        googleAnalytics.send_transaction(
            json_data[data]['sku'],
            json_data[data]['category'],
            json_data[data]['name'],
            json_data[data]['series'],
            json_data[data]['price'],
            json_data[data]['currency'],
            json_data[data]['transaction_id']
        )
        print('Progress: ', int(int(data)/len(json_data)*100), '%')
    googleAnalytics.close_connection()

if __name__ == '__main__':
    main()
