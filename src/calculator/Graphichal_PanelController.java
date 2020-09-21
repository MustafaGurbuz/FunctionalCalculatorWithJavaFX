package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;

public class Graphichal_PanelController implements Initializable {
    
    @FXML
    Button sin;
    @FXML
    Button cos;
    @FXML
    Button tan;
    @FXML
    Button cot;
    @FXML
    Pane pn;
    @FXML
    Label lb;
    
    @FXML
    public void handleAction(ActionEvent event)
    {
        lb.setVisible(false);
        Line line1 = new Line(250,0,250,300);
        line1.setStroke(Color.GREEN);
        line1.setStrokeWidth(5);
        pn.getChildren().add(line1);
        
        Line line2 = new Line(0,150,500,150);
        line2.setStroke(Color.GREEN);
        line2.setStrokeWidth(5);
        pn.getChildren().add(line2);
        
        if(event.getSource() == sin)
        {
            QuadCurve curve1 = new QuadCurve(250,150,275,100,300,150);
            QuadCurve curve2 = new QuadCurve(300,150,325,200,350,150);
            QuadCurve curve3 = new QuadCurve(350,150,375,100,400,150);
            QuadCurve curve4 = new QuadCurve(400,150,425,200,450,150);
            QuadCurve curve5 = new QuadCurve(450,150,475,100,500,150);
            pn.getChildren().add(curve1);
            pn.getChildren().add(curve2);
            pn.getChildren().add(curve3);
            pn.getChildren().add(curve4);
            pn.getChildren().add(curve5);  
            curve1.setFill(Color.RED);
            curve2.setFill(Color.RED);
            curve3.setFill(Color.RED);
            curve4.setFill(Color.RED);
            curve5.setFill(Color.RED);
        }
       else if(event.getSource() == cos)
        {
            QuadCurve curve1 = new QuadCurve(250,0,175,15,250,30);
            QuadCurve curve2 = new QuadCurve(250,30,325,45,250,60);
            QuadCurve curve3 = new QuadCurve(250,60,175,75,250,90);
            QuadCurve curve4 = new QuadCurve(250,90,325,105,250,120);
            QuadCurve curve5 = new QuadCurve(250,120,175,135,250,150);
            pn.getChildren().add(curve1);
            pn.getChildren().add(curve2);
            pn.getChildren().add(curve3);
            pn.getChildren().add(curve4);
            pn.getChildren().add(curve5);  
            curve1.setFill(Color.BLUE);
            curve2.setFill(Color.BLUE);
            curve3.setFill(Color.BLUE);
            curve4.setFill(Color.BLUE);
            curve5.setFill(Color.BLUE);
        }
        else if(event.getSource() == tan)
        {
            QuadCurve curve1 = new QuadCurve(250,150,325,165,250,180);
            QuadCurve curve2 = new QuadCurve(250,180,175,195,250,210);
            QuadCurve curve3 = new QuadCurve(250,210,325,225,250,240);
            QuadCurve curve4 = new QuadCurve(250,240,175,255,250,270);
            QuadCurve curve5 = new QuadCurve(250,270,325,285,250,300);
            pn.getChildren().add(curve1);
            pn.getChildren().add(curve2);
            pn.getChildren().add(curve3);
            pn.getChildren().add(curve4);
            pn.getChildren().add(curve5);
            curve1.setFill(Color.DODGERBLUE);
            curve2.setFill(Color.DODGERBLUE);
            curve3.setFill(Color.DODGERBLUE);
            curve4.setFill(Color.DODGERBLUE);
            curve5.setFill(Color.DODGERBLUE);
        }
        else if(event.getSource() == cot)
        {
            QuadCurve curve1 = new QuadCurve(0,150,25,200,50,150);
            QuadCurve curve2 = new QuadCurve(50,150,75,100,100,150);
            QuadCurve curve3 = new QuadCurve(100,150,125,200,150,150);
            QuadCurve curve4 = new QuadCurve(150,150,175,100,200,150);
            QuadCurve curve5 = new QuadCurve(200,150,225,200,250,150);
            pn.getChildren().add(curve1);
            pn.getChildren().add(curve2);
            pn.getChildren().add(curve3);
            pn.getChildren().add(curve4);
            pn.getChildren().add(curve5); 
            curve1.setFill(Color.DARKORANGE);
            curve2.setFill(Color.DARKORANGE);
            curve3.setFill(Color.DARKORANGE);
            curve4.setFill(Color.DARKORANGE);
            curve5.setFill(Color.DARKORANGE);
        }
        pn.getChildren().add(lb);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
