# Rest api
Need run schema-mysql.sql first, also configure mysql settings
* default username: admin password: admin001

The following are address of the apis:

* GET: localhost:9000/getAllUser get all user data
* GET: localhost:9000/get/users/{id} get user data with id = {id}
* PUT: localhost:9000/update/users update user data, username is a must field
* DELETE: localhost:9000/delete/users/{id} delete user with id = {id}

