# Gamer Apps with SpringBoot

A brief description of what this project does and who it's for


## API Reference

#### Add new user

```http
 POST http //localhost:8080/users
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name` | `string` | **Required**. |
| `nickName` | `string` |  |
| `geoId` | `Geography` |  |
| `gender` | `string` | **Required**. |
| `credits` | `long` |  |

#### Get user

```http
  GET http //localhost:8080/user/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of user to fetch |

#### getAll users

```http
  GET http //localhost:8080/users
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of user to fetch |

####  update user

```http
  put  http //localhost:8080/users/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of user to update |
| `user`      | `User` | **Required**. User object to update |

####  Add credit to user

```http
  put  http //localhost:8080/users/{id}/credit/{id2}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id1`      | `long` | **Required**.  |
| `user`      | `User` | **Required**. |
| `Credit`      | `Credit` | **Required**. Credit object to update |
| `id2`      | `long` | **Required**. long value to ADD Credit to user  |

### delete user

```http
  Delete http //localhost:8080/users/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of user to Delete |


#### Add new game

```http
 POST http //localhost:8080/games
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name` | `string` | **Required**. |


#### Get Game

```http
  GET http //localhost:8080/games/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of user to fetch |

#### getAll users

```http
  GET http //localhost:8080/games
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of user to fetch |









## Appendix

Any additional information goes here


## Demo

Insert gif or link to demo


## Documentation




## Features


- Cross platform


## Running Tests

To run tests, run the following command

```bash
  run test UsersRepositoryTest.java file
