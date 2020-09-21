package calculator;


import java.awt.Canvas;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.mariuszgromada.math.mxparser.*;




public class FXMLDocumentController implements Initializable {
    
    Float data=0f;
    double d;
    int operation=-10;
    @FXML
    private Button bir;
    
     @FXML
    private Button log;
     
     @FXML
    private Button sin;
     
     @FXML
    private Button cos;
     
     @FXML
    private Button tan;
     
     @FXML
    private Button mod;
     
     @FXML
    private Button ustel;
     
     @FXML
    private Button fakt;
    
    @FXML
    private Button kok;
    
    @FXML
    private Button dort;

    @FXML
    private Button yedi;

    @FXML
    private Button sifir;

    @FXML
    private Button iki;

    @FXML
    private Button uc;

    @FXML
    private Button bolme;

    @FXML
    private Button bes;

    @FXML
    private Button dokuz;

    @FXML
    private Button toplama;

    @FXML
    private Button alti;

    @FXML
    private Button carpma;

    @FXML
    private Button sekiz;

    @FXML
    private Button cikarma;

    @FXML
    private Button nokta;

    @FXML
    private Button sonuc;
    
     @FXML
    private Button cot;
     
      @FXML
    private Button onust;
    
       @FXML
    private Button ustsy;
       
        @FXML
    private Button fonk;
       
    @FXML
    private Button geri;
    
     @FXML
    private Button temizle;
     
    @FXML
    private TextField textfield;

    
    @FXML
    private void graphichAction(ActionEvent ev) {
         try{
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Graphichal_Panel.fxml"));
        Line lin = new Line(20,50,400,50);
        lin.setStrokeWidth(10);
        
        Parent root1 = (Parent) fxmlloader.load();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Graphic");
        stage.setScene(new Scene(root1));
        stage.show();
       }
       catch(Exception e){
           System.out.println("Can't load window");
       }
    }
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
      
       if(event.getSource() == bir){
           textfield.setText(textfield.getText() + "1");
       }
       else if(event.getSource() == iki){
           textfield.setText(textfield.getText() + "2");
       }
        else if(event.getSource() == uc){
           textfield.setText(textfield.getText() + "3");
       }
        else if(event.getSource() == dort){
           textfield.setText(textfield.getText() + "4");
       }
        else if(event.getSource() == bes){
           textfield.setText(textfield.getText() + "5");
       }
        else if(event.getSource() == alti){
           textfield.setText(textfield.getText() + "6");
       }
        else if(event.getSource() == yedi){
           textfield.setText(textfield.getText() + "7");
       }
        else if(event.getSource() == sekiz){
           textfield.setText(textfield.getText() + "8");
       }
        else if(event.getSource() == dokuz){
           textfield.setText(textfield.getText() + "9");
       }
        else if(event.getSource() == sifir){
           textfield.setText(textfield.getText() + "0");
       }
        else if(event.getSource() == temizle){
           textfield.setText("");
       }
        else if(event.getSource() == kok){
            d = Double.parseDouble(textfield.getText());
             textfield.setText(String.valueOf(Math.sqrt(d)));
        }
        else if(event.getSource() == log){
            data = Float.parseFloat(textfield.getText());
            textfield.setText(String.valueOf(Math.log10(data)));
        }
       /* else if(event.getSource()== fonk)
        {
            data = Float.parseFloat(textfield.getText());
            textfield.setText(String.valueOf((Math.exp(1+data)*Math.pow(data, 2))));
        }*/
        else if(event.getSource() == mod){
            data = Float.parseFloat(textfield.getText());
           operation = 5;
           textfield.setText("");
        }
        else if(event.getSource() == sin){
            d = Double.parseDouble(textfield.getText());
            double radians = Math.toRadians(d);
             textfield.setText(String.valueOf(Math.sin(radians)));
        }
        else if(event.getSource() == cot){
            d = Double.parseDouble(textfield.getText());
            double radians = Math.toRadians(d);
             textfield.setText(String.valueOf((Math.cos(radians)/Math.sin(radians))));
        }
         else if(event.getSource() == cos){
            d = Double.parseDouble(textfield.getText());
            double radians = Math.toRadians(d);
             textfield.setText(String.valueOf(Math.cos(radians)));
        }
          else if(event.getSource() == tan){
            d = Double.parseDouble(textfield.getText());
            double radians = Math.toRadians(d);
             textfield.setText(String.valueOf(Math.tan(radians)));
        }
         else if(event.getSource() == fakt){
            data = Float.parseFloat(textfield.getText());
            int fak = 1;
           for(int i = 1;i<=data;i++)
           {
               fak = fak * i;
           }
           textfield.setText(String.valueOf(fak));
        }
         else if(event.getSource() == ustel){
            d = Double.parseDouble(textfield.getText());
            double snc = d * d;
            textfield.setText(String.valueOf(snc));
        }
         else if(event.getSource() == ustsy){
            d = Double.parseDouble(textfield.getText());
            operation = 6;
            textfield.setText("");
        }
          else if(event.getSource() == onust){
            int a = Integer.parseInt(textfield.getText());
            int i,y=1;
            for(i=0;i<a;i++){
                y = y*10;
            }
            textfield.setText(String.valueOf(y));
        }
        else if(event.getSource() == toplama){
           data = Float.parseFloat(textfield.getText());
           operation = 1;
           textfield.setText("");
       }
        else if(event.getSource() == cikarma){
           data = Float.parseFloat(textfield.getText());
           operation = 2;
           textfield.setText("");
       }
        else if(event.getSource() == carpma){
           data = Float.parseFloat(textfield.getText());
           operation = 3;
           textfield.setText("");
       }
        else if(event.getSource() == bolme){
           data = Float.parseFloat(textfield.getText());
           operation = 4;
           textfield.setText("");
       }
        else if(event.getSource() == nokta){
            textfield.setText(textfield.getText() + ".");
        }
        else if(event.getSource() == geri){
            textfield.setText(textfield.getText().substring(0,textfield.getText().length()-1));
        }
        else if(event.getSource() == sonuc)
        {
            Float so = Float.parseFloat(textfield.getText());
            double dr = Double.parseDouble(textfield.getText());
            double y = d;
            switch(operation){
                case 1:
                    Float dt = data + so;
                    textfield.setText(String.valueOf(dt));
                    break;
                case 2:
                     dt = data - so;
                    textfield.setText(String.valueOf(dt));
                    break;
                case 3:
                     dt = data * so;
                    textfield.setText(String.valueOf(dt));
                    break;
                case 4:
                    dt = 0f;
                    try{
                     dt = data / so;
                    }
                    catch(Exception e){textfield.setText("Error");}
                    textfield.setText(String.valueOf(dt));
                    break;
                case 5:
                     dt = data % so;
                    textfield.setText(String.valueOf(dt));
                    break;
                case 6:
                     for(int a=1;a<dr;a++)
                     {
                        y = y * d;
                     }
                    textfield.setText(String.valueOf(y));
                    break;
                    
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
