// importaciones
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

// la clase App extiende Application, por lo que es la entrada principal de la aplicación
public class App extends Application {

    // main, lanza la app javaFX
    public static void main(String[] args) {
        launch(args);
    }

    // metodo start, es el punto de entrada, se ejecuta después de lanzar la aplicacion
    @Override
    public void start(Stage escenario) {

        // creación del Pane, contendrá las formas geométricas del ejercicio
        Pane root = new Pane();

        // creo un grupo que contendrá las 3 líneas
        Group grupoLineas = new Group();

        // líneas
        Line linea1 = new Line();
        linea1.setStartX(100);
        linea1.setStartY(100);
        linea1.setEndX(200);
        linea1.setEndY(200);
        grupoLineas.getChildren().add(linea1); // añado la linea1 al grupo

        Line linea2 = new Line(200, 100, 300, 200);
        linea2.setStrokeWidth(10); // grosor de la linea2
        grupoLineas.getChildren().add(linea2); // añado la linea2 al grupo

        Line linea3 = new Line(300, 100, 400, 200);
        linea3.setStrokeWidth(5); // grosor de la linea3
        linea3.setStroke(Color.PURPLE); // color linea3
        grupoLineas.getChildren().add(linea3); // añado la linea3 al grupo

        // añado el grupo de líneas al pane
        root.getChildren().add(grupoLineas);

        // creo un grupo que contendrá las 3 formas geométricas
        Group grupoFormas = new Group();

        // círculo
        Circle circulo = new Circle(300, 200, 50, Color.ORANGE);
        grupoFormas.getChildren().add(circulo); // añado circulo al grupo

        // cuadrado
        Rectangle cuadrado = new Rectangle();
        // coordenadas
        cuadrado.setX(300);
        cuadrado.setY(200);
        // ancho, alto y color
        cuadrado.setWidth(40);
        cuadrado.setHeight(40);
        cuadrado.setFill(Color.PINK);
        grupoFormas.getChildren().add(cuadrado); // añado el cuadrado al grupo

        // pentagono
        Polygon pentagono = new Polygon();
        // añado los puntos (vertices) del pentagono, representados por coordenadas
        pentagono.getPoints().addAll(
                new Double[] {
                        400.0, 200.00,
                        450.0, 200.00,
                        500.0, 250.00,
                        425.00, 300.00,
                        350.0, 250.00
                });
        grupoFormas.getChildren().add(pentagono); // añado el pentagono al grupo
        
        // roto el grupo 78 grados
        grupoFormas.setRotate(78);
        // añado el grupo al Pane
        root.getChildren().add(grupoFormas);

        // creo la escena y establezco su tamaño
        escenario.setScene(new Scene(root, 600, 400));
        escenario.setTitle("Caso1 UD1"); // tituloe
        escenario.show(); // mostrar la ventana en pantalla
    }
}

// Al ejecutar el programa, se mostrarán las lineas y el grupo de formas rotadas 78 grados