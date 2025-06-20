# Экзамен РПКС
### Жбанков Матвей - 313Б
# Вопрос 1

    Iterable
        Collection
            List → (ArrayList, LinkedList, Vector)
            Set → (HashSet, LinkedHashSet, TreeSet)
                SortedSet
                    NavigableSet
            Queue → (PriorityQueue, ArrayDeque)
                Deque
    Map → (HashMap, LinkedHashMap, TreeMap)
        SortedMap
            NavigableMap
## Интерфейсы коллекций

### Collection

- Базовый интерфейс для всех коллекций (кроме Map).
- Методы: `add`, `remove`, `size`, `iterator` и др.

### List

- Упорядоченная коллекция элементов (допускает дубли).
- Примеры: `ArrayList`, `LinkedList`, `Vector`.

### Set

- Коллекция уникальных элементов (без дубликатов).
- Примеры: `HashSet`, `LinkedHashSet`, `TreeSet`.

### Queue

- Очереди, работающие по принципу FIFO (first-in, first-out).
- Примеры: `PriorityQueue`, `ArrayDeque`.

### Deque

- Двунаправленная очередь (double ended queue).
- Пример: `ArrayDeque`.

### Map

- Коллекция пар «ключ-значение».
- Не наследует `Collection`.
- Примеры: `HashMap`, `TreeMap`, `LinkedHashMap`.


