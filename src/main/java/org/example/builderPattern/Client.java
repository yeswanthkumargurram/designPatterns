package org.example.builderPattern;

public class Client {
    public static void main(String[] args){
        Student student = Student.getBuilder().setName("Sai")
                .setAge(25)
                .setBatchName("Jun22")
                .setUniversityName("AnnaUniversity")
                .setPhoneNumber("89787970709870")
                .build();

        System.out.println("Name :" + student.getName() +
                " Age :" + student.getAge() +
                " BatchName :" + student.getBatchName() +
                " University :" + student.getUniversityName() +
                " PhoneNumber :" + student.getPhoneNumber());
    }
}
