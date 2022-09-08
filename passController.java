/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecvmaker;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author lokamloka
 */
public class passController implements Initializable{
    @FXML
    private Label name;
    @FXML
    private Label job;
    @FXML
    private Label education;
    @FXML
    private Label email;
    @FXML
    private Label aboutyou;
    @FXML
    private Label skill1;
    @FXML
    private Label skill2;
    @FXML
    private Label course1;
    @FXML
    private Label course2;
    @FXML
    private Label location;
    @FXML
    private Label contactNO;
    @FXML
    private Label lang1;
    @FXML
    private Label lang2;
      

 @Override
 public void initialize(URL url, ResourceBundle rb) {
        //retrive
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<cvnodel> sList = null;
        String queryStr = "from cvnodel";
        org.hibernate.Query query = session.createQuery(queryStr);
        sList = query.list();
        session.close();
        System.out.println("cvnodel list size: "+sList.size());

        for(cvnodel s: sList)
        {
            System.out.println(s.getName()+" "+s.getJob());
            name.setText(s.getName());
            job.setText(s.getJob());
            email.setText(s.getEmail());
            education.setText(s.getEducation());
            skill1.setText(s.getSkill1());
            skill2.setText(s.getSkill2());
            course1.setText(s.getCourse1());
            course2.setText(s.getCourse2());
            lang1.setText(s.getLang1());
            lang2.setText(s.getLang2());
            location.setText(s.getLocation());
            contactNO.setText(s.getContactNO());      
        }
 }
}

// public void passobject(cvnodel x){
//
//     pass=new cvnodel(x.getName(),x.getJob(),x.getEducation(),x.getEmail(),x.getAboutyou()
//             ,x.getSkill1(),x.getSkill2(),x.getCourse1(),x.getCourse2(),
//             x.getLocation(),x.getContactNO(),x.getLang1(),x.getLang2());
//     
//     System.out.println(name.getText());
// }
