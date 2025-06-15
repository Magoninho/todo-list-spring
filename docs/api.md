---
title: Todo List Spring Boot v1.0.0
language_tabs:
  - shell: Shell
language_clients:
  - shell: request
toc_footers: []
includes: []
search: true
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="todo-list-spring-boot">Todo List Spring Boot v1.0.0</h1>

Base URLs:

* <a href="localhost:3000">localhost:3000</a>

<h1 id="todo-list-spring-boot-default">Default</h1>

## get__tasks

> Code samples

```shell
# You can also use wget
curl -X GET localhost:3000/tasks \
  -H 'Accept: application/json'

```

`GET /tasks`

*Listar todas as tarefas*

> Example responses

> 200 Response

```json
[
  {
    "id": 0,
    "title": "string",
    "description": "string",
    "status": "string"
  }
]
```

<h3 id="get__tasks-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Listar todas as tarefas|Inline|

<h3 id="get__tasks-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|» id|integer|false|none|none|
|» title|string|false|none|none|
|» description|string|false|none|none|
|» status|string|false|none|none|

### Response Headers

|Status|Header|Type|Format|Description|
|---|---|---|---|---|
|200|Content-Type|string||none|
|200|Transfer-Encoding|string||none|
|200|Date|string||none|
|200|Keep-Alive|string||none|
|200|Connection|string||none|

<aside class="success">
This operation does not require authentication
</aside>

## post__tasks

> Code samples

```shell
# You can also use wget
curl -X POST localhost:3000/tasks \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

`POST /tasks`

*Postar uma tarefa*

> Body parameter

```json
{
  "title": "string",
  "description": "string",
  "status": "string"
}
```

<h3 id="post__tasks-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|object|false|none|
|» title|body|string|false|none|
|» description|body|string|false|none|
|» status|body|string|false|none|

> Example responses

> 200 Response

```json
{
  "id": 0,
  "title": "string",
  "description": "string",
  "status": "string"
}
```

<h3 id="post__tasks-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Postar uma tarefa|Inline|

<h3 id="post__tasks-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|» id|integer|false|none|none|
|» title|string|false|none|none|
|» description|string|false|none|none|
|» status|string|false|none|none|

### Response Headers

|Status|Header|Type|Format|Description|
|---|---|---|---|---|
|200|Content-Type|string||none|
|200|Transfer-Encoding|string||none|
|200|Date|string||none|
|200|Keep-Alive|string||none|
|200|Connection|string||none|

<aside class="success">
This operation does not require authentication
</aside>

## put__tasks_update_1

> Code samples

```shell
# You can also use wget
curl -X PUT localhost:3000/tasks/update/1 \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

`PUT /tasks/update/1`

*Editar uma tarefa*

> Body parameter

```json
{
  "title": "string",
  "description": "string",
  "status": "string"
}
```

<h3 id="put__tasks_update_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|object|false|none|
|» title|body|string|false|none|
|» description|body|string|false|none|
|» status|body|string|false|none|

> Example responses

> 200 Response

```json
{
  "id": 0,
  "title": "string",
  "description": "string",
  "status": "string"
}
```

<h3 id="put__tasks_update_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Editar uma tarefa|Inline|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|Falha ao editar tarefa|None|

<h3 id="put__tasks_update_1-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|» id|integer|false|none|none|
|» title|string|false|none|none|
|» description|string|false|none|none|
|» status|string|false|none|none|

### Response Headers

|Status|Header|Type|Format|Description|
|---|---|---|---|---|
|200|Content-Type|string||none|
|200|Transfer-Encoding|string||none|
|200|Date|string||none|
|200|Keep-Alive|string||none|
|200|Connection|string||none|
|404|Content-Length|integer||none|
|404|Date|string||none|
|404|Keep-Alive|string||none|
|404|Connection|string||none|

<aside class="success">
This operation does not require authentication
</aside>

## delete__tasks_delete_1

> Code samples

```shell
# You can also use wget
curl -X DELETE localhost:3000/tasks/delete/1 \
  -H 'Accept: application/json'

```

`DELETE /tasks/delete/1`

*Excluir uma tarefa*

> Example responses

> 200 Response

```json
{
  "id": 0,
  "title": "string",
  "description": "string",
  "status": "string"
}
```

<h3 id="delete__tasks_delete_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Sucesso|Inline|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|Falha ao excluir tarefa|None|

<h3 id="delete__tasks_delete_1-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|» id|integer|false|none|none|
|» title|string|false|none|none|
|» description|string|false|none|none|
|» status|string|false|none|none|

### Response Headers

|Status|Header|Type|Format|Description|
|---|---|---|---|---|
|200|Content-Type|string||none|
|200|Transfer-Encoding|string||none|
|200|Date|string||none|
|200|Keep-Alive|string||none|
|200|Connection|string||none|
|404|Content-Length|integer||none|
|404|Date|string||none|
|404|Keep-Alive|string||none|
|404|Connection|string||none|

<aside class="success">
This operation does not require authentication
</aside>

