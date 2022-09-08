/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecvmaker;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
/**
 *
 * @author lokamloka
 */
@Entity
@Table(name="CVmaker")
public class cvnodel {
    @Id
    @Column(name="name")
    private String name;
    @Column(name="job")
    private String job;
    @Column(name="education")
    private String education;
    @Column(name="email")
    private String email;
    @Column(name="aboutyou")
    private String aboutyou;
    @Column(name="skill1")
    private String skill1;
    @Column(name="skill2")
    private String skill2;
    @Column(name="course1")
    private String course1;
    @Column(name="course2")
    private String course2;
    @Column(name="location")
    private String location;
    @Column(name="contactNO")
    private String contactNO;
    @Column(name="lang1")
    private String lang1;
    @Column(name="lang2")
    private String lang2;
    public cvnodel(String name,String job,String education,String email,String aboutyou
            ,String skill1,String skill2,String course1,String course2,String location,String contactNO,String lang1,String lang2){
        this.name=name;
        this.job=job;
        this.contactNO=contactNO;
        this.skill1=skill1;
        this.skill2=skill2;
        this.course1=course1;
        this.course2=course2;
        this.aboutyou=aboutyou;
        this.email=email;
        this.lang1=lang1;
        this.lang2=lang2;
        this.location=location;
        this.education=education; 
    }
    public cvnodel(){
        
    }
    
    //getter
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getJob(){
        return job;
    }
    public String getContactNO(){
        return contactNO;
    }
    public String getSkill1(){
        return skill1;
    }
    public String getSkill2(){
        return skill2;
    }
    public String getCourse1(){
        return course1;
    }
    public String getCourse2(){
        return course2;
    }
    public String getLang1(){
        return lang1;
    }
    public String getLang2(){
        return lang2;
    }
    public String getAboutyou(){
        return aboutyou;
    }
    public String getEducation(){
        return education;
    }
    public String getLocation(){
        return location;
    }
    
    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setJob(String job){
        this.job=job;
    }
    public void setContactNO(String contactNO){
        this.contactNO=contactNO;
    }
    public void setSkill1(String skill1 ){
        this.skill1=skill1;
    }
    public void setSkill2(String skill2){
        this.skill2=skill2;
    }
    public void setCourse1(String course1){
        this.course1=course1;
    }
    public void setCourse2(String course2){
        this.course2=course2;
    }
    public void setLang1(String lang1){
        this.lang1=lang1;
    }
    public void setLang2(String lang2){
        this.lang2=lang2;
    }
    public void setAboutyou(String aboutyou){
        this.aboutyou=aboutyou;
    }
    public void setEducation(String education){
        this.education=education;
    }
    public void setLocation(String location){
        this.location=location;
    }
}
