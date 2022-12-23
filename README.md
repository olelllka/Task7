# Task 7 Паттерн наблюдатель(Observer)

Паттерн Наблюдатель (Observer) определяет зависимость "один-ко-многим" между объектами так, 
что при изменении состояния одного объекта все зависящие от него объекты уведомляются и обновляются автоматически.
Данная программа реализует несколько объектов, один из которых выполняет некое действие, а остальные "наблюдают" и выполняют действия
на основе полученной информации. В данном случае объектом выполняющим действие является TimeServer который ведет отсчет виртуального времени,
в это же время остальные три объекта ведут отслеживание этого времени, построение фигур и вывод сообщения через указаный промежуток времени(таймер)
