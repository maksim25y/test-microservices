<details><summary>Запуск</summary>
Для того, чтобы запустить необходимо проделать следующие шаги на Windows, установите [Git Bash](https://git-scm.com/)

1. Склонируйте репозиторий

```shell
git clone git@github.com:maksim25y/TranslateTask.git
```

2. Скачайте и установите Docker

Скачать и найти инструкцию по установке вы можете на официальном сайте [Docker](https://www.docker.com)

3. Запустите сайт в Docker

Для этого запустите Docker, откройте терминал и перейдите в папку репозитория

```shell
cd TranslateTask
```
Далее введите команду

```shell
docker-compose up --build
```
Готово! Сервер запущен.
Чтобы зайти на сайт перейдите по ссылке: 127.0.0.1:8080

Чтобы остановить работу контейнеров, в терминале, откуда вы запускали docker-compose нажмите Ctrl+C (Control + C для Mac)
</details>

</details>
<details><summary>Функционал</summary>
На главной странице расположена форма. В неё пользователь должен ввести следующие значения:
1) Текст для перевода
2) Исходный язык
3) Целевой язык 
![image](https://github.com/user-attachments/assets/508e76a6-7363-488c-a941-23dc7ebc5df0)
После ввода необходимо нажать на кнопку "Перевод".
Если данные введены корректно, то будет осуществлён перевод. Переведённый текст будет отображен под кнопкой.
![image](https://github.com/user-attachments/assets/f086aa95-690c-4e9b-a6ac-8284259444a7)
Если данные введены некорректно или произошла ошибка, то будет выведено сообщение об ошибке.  
![image](https://github.com/user-attachments/assets/20800c95-52d4-4765-b099-033de6c16418)
![image](https://github.com/user-attachments/assets/832b5753-841d-4883-9cae-ecfffbca23d1)
</details>
![image](https://github.com/user-attachments/assets/972b3364-72ef-40f5-94a5-c50c3b6e617b)

<details><summary>Доступные языки</summary>
en - English
af - Afrikaans
sq - Albanian
am - Amharic
ar - Arabic
hy - Armenian
as - Assamese
ay - Aymara
az - Azerbaijani
bm - Bambara
eu - Basque
be - Belarusian
bn - Bengali
bho - Bhojpuri
bs - Bosnian
bg - Bulgarian
ca - Catalan
ceb - Cebuano
zh - Chinese (Simplified)
zh-CN - Chinese (Simplified)
zh-TW - Chinese (Traditional)
co - Corsican
hr - Croatian
cs - Czech
da - Danish
dv - Dhivehi
doi - Dogri
nl - Dutch
eo - Esperanto
et - Estonian
ee - Ewe
fil - Filipino (Tagalog)
fi - Finnish
fr - French
fy - Frisian
gl - Galician
ka - Georgian
de - German
el - Greek
gn - Guarani
gu - Gujarati
ht - Haitian Creole
ha - Hausa
haw - Hawaiian
he - Hebrew
iw - Hebrew
hi - Hindi
hmn - Hmong
hu - Hungarian
is - Icelandic
ig - Igbo
ilo - Ilocano
id - Indonesian
ga - Irish
it - Italian
ja - Japanese
jv - Javanese
jw - Javanese
kn - Kannada
kk - Kazakh
km - Khmer
rw - Kinyarwanda
gom - Konkani
ko - Korean
kri - Krio
ku - Kurdish
ckb - Kurdish (Sorani)
ky - Kyrgyz
lo - Lao
la - Latin
lv - Latvian
ln - Lingala
lt - Lithuanian
lg - Luganda
lb - Luxembourgish
mk - Macedonian
mai - Maithili
mg - Malagasy
ms - Malay
ml - Malayalam
mt - Maltese
mi - Maori
mr - Marathi
mni-Mtei - Meiteilon (Manipuri)
lus - Mizo
mn - Mongolian
my - Myanmar (Burmese)
ne - Nepali
no - Norwegian
ny - Nyanja (Chichewa)
or - Odia (Oriya)
om - Oromo
ps - Pashto
fa - Persian
pl - Polish
pt - Portuguese (Portugal, Brazil)
pa - Punjabi
qu - Quechua
ro - Romanian
ru - Russian
sm - Samoan
sa - Sanskrit
gd - Scots Gaelic
nso - Sepedi
sr - Serbian
st - Sesotho
sn - Shona
sd - Sindhi
si - Sinhala (Sinhalese)
sk - Slovak
sl - Slovenian
so - Somali
es - Spanish
su - Sundanese
sw - Swahili
sv - Swedish
tl - Tagalog (Filipino)
tg - Tajik
ta - Tamil
tt - Tatar
te - Telugu
th - Thai
ti - Tigrinya
ts - Tsonga
tr - Turkish
tk - Turkmen
ak - Twi (Akan)
uk - Ukrainian
ur - Urdu
ug - Uyghur
uz - Uzbek
vi - Vietnamese
cy - Welsh
xh - Xhosa
yi - Yiddish
yo - Yoruba
zu - Zulu

</details>

