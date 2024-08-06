package com.greedy.level01.basic.student.model.dto;

public class StudentDTO {

    private int grade; // 학년
    private int classroom; // 반
    private String Name; // 이름
    private int kor; // 국어점수
    private int eng; // 영어점수
    private int math; // 수학점수

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String Name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.Name = Name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

//    public int getGrade() {
//        return grade;
//    }
//
//    public void setGrade(int grade) {
//        this.grade = grade;
//    }
//
//    public int getClassroom() {
//        return classroom;
//    }
//
//    public void setClassroom(int classroom) {
//        this.classroom = classroom;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public int getKor() {
//        return kor;
//    }
//
//    public void setKor(int kor) {
//        this.kor = kor;
//    }
//
//    public int getEng() {
//        return eng;
//    }
//
//    public void setEng(int eng) {
//        this.eng = eng;
//    }
//
//    public int getMath() {
//        return math;
//    }
//
//    public void setMath(int math) {
//        this.math = math;
//    }

    public String getInformation() {

      int evg = (kor + eng + math) / 3;
      return grade + " " + classroom + " " + Name + " " + kor + " " + eng + " " + math + " " + evg;
    }

}
