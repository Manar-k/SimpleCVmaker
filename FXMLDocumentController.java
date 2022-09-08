/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecvmaker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lokamloka
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField name;
    @FXML
    private TextField job;
    @FXML
    private TextField education;
    @FXML
    private TextField email;
    @FXML
    private TextField aboutyou;
    @FXML
    private TextField skill1;
    @FXML
    private TextField skill2;
    @FXML
    private TextField course1;
    @FXML
    private TextField course2;
    @FXML
    private TextField location;
    @FXML
    private TextField contactNO;
    @FXML
    private TextField lang1;
    @FXML
    private TextField lang2;
    
    
    @FXML
    private void showCV(ActionEvent event) throws IOException{//changes scene to final cv scene
        Parent cv_page=FXMLLoader.load(getClass().getResource("cv.fxml"));
        Scene cv_scene=new Scene(cv_page);
        
        
        cvnodel cv=new cvnodel();
 
        cv.setName(name.getText());
        cv.setJob(job.getText());
        cv.setEmail(email.getText());
        cv.setContactNO(contactNO.getText());
        cv.setEducation(education.getText());
        cv.setAboutyou(aboutyou.getText());
        cv.setCourse1(course1.getText());
        cv.setCourse2(course2.getText());
        cv.setSkill1(skill1.getText());
        cv.setSkill2(skill2.getText());
        cv.setLang1(lang1.getText());
        cv.setLang2(lang2.getText());
        cv.setLocation(location.getText()); 
        
        //insert new cv data
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        tx.commit();
        session.close();
        System.out.println("inserted cv owner name: "+cv.getName());
        
        Stage stage1=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage1.setScene(cv_scene);
        stage1.show();
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }    
    
}
