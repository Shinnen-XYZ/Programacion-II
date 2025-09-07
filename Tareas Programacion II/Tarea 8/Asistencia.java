import java.util.ArrayList;
import java.util.List;

public class Asistencia {
    private List<Estudiante> estudiantes;

    public Asistencia() {
        this.estudiantes = new ArrayList<>();
    }

    public void addEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            throw new MyException("El estudiante no puede ser null");
        }
        estudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Asistencia:\n");
        for (Estudiante e : estudiantes) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }
}
