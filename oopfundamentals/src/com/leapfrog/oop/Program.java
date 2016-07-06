/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oop;
import com.leapfrog.oop.entity.Student;
import com.leapfrog.oop.entity.Employee;
import com.leapfrog.oop.entity.Artist;
import com.leapfrog.oop.entity.Author;
import com.leapfrog.oop.entity.Singer;
import com.leapfrog.oop.entity.Actor;
import com.leapfrog.oop.entity.Army;
import com.leapfrog.oop.entity.Dancer;
import com.leapfrog.oop.entity.Doctor;
import com.leapfrog.oop.entity.Nurse;
/**
 *
 * @author Bipins
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Student s = new Student();
     s.setId(1);
     s.setRollno(1);
     s.setFirstName("Bipin");
     s.setLastName("Shrestha");
     s.setEmail("bipinhyoju@gmail.com");
     s.setDob("1992-11-11");
     s.setContactNo("9818398180");
     s.setGender("Male");
     s.setStatus(true);
     s.work();
     System.out.println(s.getFullName());
     System.out.println("Roll No." + s.getRollno());
        
     Employee e = new Employee();
     e.setId(2);
     e.setFirstName("Ramesh");
     e.setLastName("Shrestha");
     e.setEmail("ramesh@gmail.com");
     e.setDesignation("Manager");
     System.out.println(e.getFullName());
     System.out.println("Designation:" + e.getDesignation());
     
     Artist a = new Artist();
     a.setId(3);
     a.setFirstName("Rabin");
     a.setLastName("Shrestha");
     a.setEmail("rabin@gmail.com");
     a.setArt("Contemporary");
     System.out.println(a.getFullName());
     System.out.println("Art:" + a.getArt());
     
     Author a1 = new Author();
     a1.setId(4);
     a1.setFirstName("Nabin");
     a1.setLastName("Shrestha");
     a1.setEmail("nabin@gmail.com");
     a1.setType("Novelist");
     System.out.println(a1.getFullName());
     System.out.println("Type:" + a1.getType());
     
     Singer s1 = new Singer();
     s1.setId(5);
     s1.setFirstName("Bikash");
     s1.setLastName("Shrestha");
     s1.setEmail("bikash@gmail.com");
     s1.setVoiceType("Bass");
     System.out.println(s1.getFullName());
     System.out.println("Voice Type:" + s1.getVoiceType());
     
     Actor a2 = new Actor();
     a2.setId(6);
     a2.setFirstName("Prakash");
     a2.setLastName("Shrestha");
     a2.setEmail("prakash@gmail.com");
     a2.setActingStyle("Realistic");
     System.out.println(a2.getFullName());
     System.out.println("Acting Style:" + a2.getActingStyle());
     
     Army a3 = new Army();
     a3.setId(7);
     a3.setFirstName("Aashish");
     a3.setLastName("Shrestha");
     a3.setEmail("aashish@gmail.com");
     a3.setMilitaryForce("Air Force");
     System.out.println(a3.getFullName());
     System.out.println("Military Force:" + a3.getMilitaryForce());
     
     Dancer d = new Dancer();
     d.setId(8);
     d.setFirstName("Renish");
     d.setLastName("Shrestha");
     d.setEmail("renish@gmail.com");
     d.setCategory("Zumba");
     d.work();
     System.out.println(d.getFullName());
     System.out.println("Dance Category:" + d.getCategory());
     
    Doctor d2 = new Doctor();
     d2.setId(9);
     d2.setFirstName("Ruska");
     d2.setLastName("Shrestha");
     d2.setEmail("ruska@gmail.com");
     d2.setNMC_No(234);
     System.out.println(d2.getFullName());
     System.out.println("NMC No.:" + d2.getNMC_No());
     
     Nurse n = new Nurse();
     n.setId(10);
     n.setFirstName("Krisha");
     n.setLastName("Shrestha");
     n.setEmail("krisha@gmail.com");
     n.setNursingCareer("Emergency");
     System.out.println(n.getFullName());
     System.out.println("Nursing Career:" + n.getNursingCareer());
    }
}

