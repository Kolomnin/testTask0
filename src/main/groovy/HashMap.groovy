class HashMapApplication {

    static void main(String[] args) {
        // Исходный массив
        def arr = ["1", "3", "4", "5", "1", "5", "4"]

        // Преобразуем массив в список
        def list = arr as List

        // Выводим список
        println list

        // Подсчитываем вхождения элементов
        def map = list.countBy { it }

        // сравниваем, что было и что стало
        printMap(map)
    }

    static void printMap(Map<String, Integer> map) {
        def entries = map.collect { key, value -> "$key : $value" }  // Преобразуем список строк ключ : значение
        def result = "{${entries.join(', ')}}"  // объединяем все элементы (с разделителем), списка  и оборачиваем в фигурные скобки
        println result
    }
}