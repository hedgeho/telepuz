# doka
## Доступ к дневнику
GET на `https://app.eschool.center/ec-server/student/diary?userId=`%USER_ID%`&d1=1554066000000&d2=1554645636682`<br>
в куки прилагаешь<br>
%COOKIE%`;site_ver=app;route=`%ROUTE%`;_pk_id.1.81ed=de563a6425e21a4f.1553009060.16.1554146944.1554139340.`<br>
В ответ прилетает много мусора в формате
``` javascript
{
  <...>
  dateBegin_s: "2019-4-1"
  dateEnd_s: "2019-4-7"
  lesson: // массив уроков в формате
  [{
    date_d: "2019-03-31T21:00:00Z"
    numInDay: 1
    part: [{<...>}] // дз
    subject: "решение задач"
    teacher: {
      <...>
      factTeacherIN: "Селякова М.В."
    }
    unit: {
      <...>
      name: "Физика"
    }
  }<...>]
}
```
