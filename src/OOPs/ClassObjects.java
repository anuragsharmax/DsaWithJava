package OOPs;

/*
    Revision Notes – Class & Object Basics

    1) Class is just a blueprint.
       It does not create memory.
       Memory is created only when we use "new".

    2) When we write:
            Student s1 = new Student();

       - s1 is stored in stack.
       - new Student() creates object in heap.
       - s1 stores the address of that object.

       So s1 is NOT the object.
       It is just a reference variable.

    3) Default values when object is created:
       String -> null
       int -> 0
       boolean -> false

    4) Dot operator:
            s1.name = "Anurag";
       means:
       go to object pointed by s1 and update its field.

    5) Printing object directly:
            System.out.println(s1);
       prints something like:
            OOPs.ClassObjects$Student@hashcode

       because toString() is not overridden.
       It prints class name + hashcode.

    6) Important for DSA:
       Understanding reference is very important.
       LinkedList will use object inside object (Node next).
       So heap + reference concept must be clear.

    7) If:
            Student s2 = s1;
       both s1 and s2 point to SAME object.

       If we change using s2,
       s1 will also see the change.

    8) If:
            s1 = null;
       object is not deleted immediately.
       It will be removed only when no reference points to it.
*/

public class ClassObjects {

    public static class Student {
        String name;
        int rno;
        int age;
        /*final keyword make the value permanent that cant be changed in future ,it is same for all objects
        made from this class*/
        final String schoolName="SDSVM";
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Anurag anand";
        s1.rno = 1;
        s1.age = 20;
        /*if we will try it will give us error
        s1.schoolName="dps";*/

        System.out.println(s1);
    }
}
