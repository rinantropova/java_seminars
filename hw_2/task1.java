/*
Дана строка sql-запроса:
select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде
json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации:
 {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
package hw_2;

public class task1 {
    public static StringBuilder sqlRequest(String query, String params) {
        String prepare = params.replace("{", "").replace("}", "")
                .replace("\"", "");
        String name = prepare.split(",")[0].split(":")[1];
        String country = prepare.split(",")[1].split(":")[1];
        String city = prepare.split(",")[2].split(":")[1];
        String age = prepare.split(",")[3].split(":")[1];

        StringBuilder result = new StringBuilder(query);

        if (!name.equals("null")) {
            result.append(" name=").append("'").append(name).append("'");
        }
        if (!name.equals("null") & !country.equals("null")) {
            result.append(" and");
        }
        if (!country.equals("null")) {
            result.append(" country=").append("'").append(country).append("'");
        }
        if (!country.equals("null") & !city.equals("null")) {
            result.append(" and");
        }
        if (!city.equals("null")) {
            result.append(" city=").append("'").append(city).append("'");
        }
        if (!city.equals("null") & !age.equals("null")) {
            result.append(" and");
        }
        if (!age.equals("null")) {
            result.append("age=").append("'").append(age).append("'");
        }
        if (!age.equals("null")) {
            result.append(" and ");
        }
        return result;
    }

    public static void main(String[] args) {
        String query = "select * from students where";
        String params = "{\name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", " +
                "\"age\":\"null\"}";

        System.out.println(sqlRequest(query, params));
    }
}
