1. Implement code till first commit yourself.
2. Make sure all Controllers in /controllers/ are taking appropriate parameters as required by corresponding APIs in https://fakestoreapi.com/docs
3. (Stretch) Try to understand https://spring.io/guides/gs/consuming-rest/ and implement FakeStoreProductServiceImpl.

Assign 2
1. Implement all of the APIs under Products at: https://fakestoreapi.com/docs (other than Limit Results and Sort Results)
2. Make your FakeStoreProductService not depend on RestTemplate at all. Instead of this it should depend on FakeStoreClient

Assign 3 
1. Go through all of the APIs in CategoryController and ProductController
2. Create a SelfProductService and SelfCategoryService implementing the corresponding interface
3. Implement the code inside each of the services. This code should now work with corresponding repositories.


User ----> Auth Server Signup 1
User ----> Auth Server Login 2 ---> token in return 
User ----> Resource Server (Product Service) "/products" token

1) If Token Valid -> 
   a) If role matches or not, If yes -- allow else deny
2) If Token invalid -> deny


1. When a [product is saved it should be saved in ES as well
2. When someone searches for product, you return all products where 
either the title contains that string 
or description contains that string via ElasticSearch

Test Data
TEST Nikhil
Test