<details><summary>Запуск</summary>
Для того, чтобы запустить необходимо проделать следующие шаги на Windows, установите [Git Bash](https://git-scm.com/)

1. Склонируйте репозиторий

```shell
git clone git@github.com:maksim25y/LibraryApp.git
```

2. Скачайте и установите Docker

Скачать и найти инструкцию по установке вы можете на официальном сайте [Docker](https://www.docker.com)

3. Запустите сайт в Docker

Для этого откройте терминал и перейдите в папку репозитория

```shell
cd LibraryAppWithSpringBoot
```

#### Переменные окружения в .env

Описание:
1. POSTGRES_USER - логин для БД
2. POSTGRES_PASSWORD - пароль от базы данных
3. SPRING_DATASOURCE_URL - адрес БД
4. SPRING_DATASOURCE_USERNAME - логин для БД, но для Spring
5. SPRING_DATASOURCE_PASSWORD - пароль для БД, но для Spring

Далее введите команду

```shell
docker-compose up --build
```
Готово! Сервер запущен.
Чтобы зайти на сайт перейдите по ссылке: localhost:8080

Чтобы остановить работу контейнеров, в терминале, откуда вы запускали docker-compose нажмите Ctrl+C (Control + C для Mac)
</details>
