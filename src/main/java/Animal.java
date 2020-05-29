 public abstract class Animal
/*
Создать классы Собака и Кот с наследованием от класса Животное.
Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина,
означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
 собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
 (Например, dog1.run(150); -> результат: run: true)
* Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м.,
 у другой 600 м.
 */
{
    private float sweemLimit;
    private float runLimit;
    private float jumpLimit;


    Animal(float sweemLimit, float runLimit, float jumpLimit)
    {
        this.sweemLimit =  sweemLimit;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    protected boolean sweem (float distance)
    {
        return distance <= sweemLimit;
    }

    protected boolean run (float distance)
    {
        return distance <= runLimit;
    }

    protected boolean jump (float height)
    {
        return height <= jumpLimit;
    }

}
