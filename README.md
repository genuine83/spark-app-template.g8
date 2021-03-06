# spark-sbt.g8

Шаблон [Giter8](https://github.com/foundweekends/giter8) для создания Spark-приложений с помощью SBT.

## Использование

1. Установить SBT
2. Запустить мастер создания проекта: `sbt new genuine83/spark-sbt.g8`
3. Заполнить в командной строке свойства проекта
4. Запустить тесты, чтобы убедиться, что проект был создан корректно. Перейти `cd` в корень проекта и запустить `sbt test`.
**Важно**: Для приложений на Spark 2 используем Scala 2.11, а для Spark 3 - Scala 2.12.

## Параметры проекта

**name (по умолчанию: etl-project)**
Имя проекта.  Конвертируется в CamelCase.

**package (по умолчанию: ru.beeline.spark.etl.project)**
Пакет верхнего уровня.  В принципе можно не менять, по умолчанию идет наш.

## Версии зависимостей по умолчанию

* **scalaVersion (default: 2.11.12)**
* **sparkVersion (default: 2.3.2)**
* **typeSafeVersion (default: 1.4.1)**
* **scalaTestVersion (default: 3.0.1)**
* **sbtVersion (default: 1.4.3)**
* **version (default: 0.0.1)**


## Возможные проблемы и их решения

* Бывает при первом запуске ругается на отсутствие главного класса. 
В этом случае лечится просто удалением папки "target" в корне проекта. После этого все ОК.