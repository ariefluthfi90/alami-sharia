#Alami Sharia Online Test

Create an API Based on requirement:

       1. Spring Boot Framework.
       2. MySQL Database or another RDBMS.
       3. Hibernate or another ORM.
       4. REST API: Content Type(JSON)
       5. Deployed in Docker
       6. Tested with Postman
       7. Include a Readme
       
Must have 2 table:

#### SELLER_TBL
     • ID
     • NAMA
     • KOTA
     
#### **PRODUCT_TBL**
     • ID 
     • SELLER_ID 
     • NAMA 
     • SATUAN 
     • HARGA_SATUAN
     
The API has been created like this:

* #### **listProductBySellerId**
  get list of product by seller id

Requirement:
    
    Base URL: http://localhost:8080/api/v1/alami-sharia/product/seller/{sellerId}
    Method: GET
    Parameter: {sellerId} - Seller Id Of The Product
    Body: -

Result: 

    {
        "responseCode": 200,
        "responseMessage": "200 OK",
        "body": [
            {
                "id": "c0a8016d-6ec7-1162-816e-c7a1efac0000",
                "createdDate": "2019-12-02T17:21:48.935+0000",
                "modifiedDate": "2019-12-02T17:21:48.935+0000",
                "sellerId": "c0a8016d-6ec7-1865-816e-c79a0f940001",
                "name": "Product 1",
                "uom": "Test",
                "price": 1000
            }
        ]
    }
    
* #### **addProduct**
  add new product

Requirement:
    
    Base URL: http://localhost:8080/api/v1/alami-sharia/product/seller/{sellerId}
    Method: POST
    Parameter: -
    Body: 
        {
          	"sellerId": "c0a8016d-6ec7-1865-816e-c79a0f940001",
          	"name": "Product 1",
          	"uom": "Test",
          	"price": 1000
          }

Result: 

    {
        "responseCode": 200,
        "responseMessage": "200 OK",
        "body": {
            "id": "c0a8016d-6ec7-1162-816e-c7a1efac0000",
            "createdDate": "2019-12-02T17:21:48.935+0000",
            "modifiedDate": "2019-12-02T17:21:48.935+0000",
            "sellerId": "c0a8016d-6ec7-1865-816e-c79a0f940001",
            "name": "Product 1",
            "uom": "Test",
            "price": 1000
        }
    }
    
* #### **searchProductByKeyword**
  get product based on keywords

Requirement:
    
    Base URL: http://localhost:8080/api/v1/alami-sharia/product/search/{keyword}
    Method: GET
    Parameter: {keyword} - Product that you want to search
    Body: -

Result: 

    {
        "responseCode": 200,
        "responseMessage": "200 OK",
        "body": [
            {
                "id": "c0a8016d-6ec7-1162-816e-c7a1efac0000",
                "createdDate": "2019-12-02T17:21:48.935+0000",
                "modifiedDate": "2019-12-02T17:21:48.935+0000",
                "sellerId": "c0a8016d-6ec7-1865-816e-c79a0f940001",
                "name": "Product 1",
                "uom": "Test",
                "price": 1000
            }
        ]
    }
    
