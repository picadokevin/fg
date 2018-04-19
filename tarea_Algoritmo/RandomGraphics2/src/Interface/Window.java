package Interface;


import java.util.Random;
import javafx.application.Application;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
//import javafx.stage.WindowEvent;

public class Window extends Application implements Runnable{

    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private Pane pane;
    private Scene scene;
    private Canvas canvas;
    private Thread thread;
    Image imagenPez;
     

    public Window() {
       
       
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Random Graphics");
        initComponents(primaryStage);
        primaryStage.show();
    }

    private void initComponents(Stage primaryStage) {
        this.pane = new Pane();
        this.scene = new Scene(this.pane, WIDTH, HEIGHT);
        this.canvas = new Canvas(WIDTH, HEIGHT);
        Image imagenPez= new Image("C:\\Users\\UsuarioPC\\Desktop\\tarea_Algoritmo\\RandomGraphics2\\src\\randomgraphics2\\sedan.png");
        this.thread = new Thread(this);
        this.thread.start();
        
        this.pane.getChildren().add(this.canvas);
        primaryStage.setScene(this.scene);
        //primaryStage.setOnCloseRequest(exit);
    }

    private void myDraw(GraphicsContext gc) {
        Random rand = new Random();
        while(true){    
            try {
               //gc.clearRect(0, 0, WIDTH, HEIGHT);
                
              // gc.setFill(Color.AQUA);
                //gc.fillRect(rand.nextInt(WIDTH-100)+1,rand.nextInt(HEIGHT-100)+1, 100, 100);
                gc.drawImage(imagenPez, rand.nextInt(WIDTH-100)+1,rand.nextInt(HEIGHT-100)+1, 100, 100);
                //gc.setFill(Color.ROSYBROWN);
                //gc.fillOval(rand.nextInt(WIDTH-100)+1,rand.nextInt(HEIGHT-100)+1, 100, 100);
                Thread.sleep(500);
            } 
            catch (InterruptedException ex) {}
        }
    }

    @Override
    public void run() {
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        myDraw(gc);
    }
    
    /*EventHandler<WindowEvent> exit = new EventHandler<WindowEvent>() {
        @Override
        public void handle(WindowEvent event) {
            System.exit(0);
        }
    };*/
}