package gestion;

import dominio.*;
import excepciones.*;
import uy.edu.um.tad.list.MyLinkedListImpl;
import uy.edu.um.tad.list.MyList;
import uy.edu.um.tad.queue.EmptyQueueException;
import uy.edu.um.tad.queue.MyQueue;
import uy.edu.um.tad.queue.MyQueueImpl;
import uy.edu.um.tad.stack.EmptyStackException;
import uy.edu.um.tad.stack.MyStack;
import uy.edu.um.tad.stack.MyStackImpl;


public class ClinicaMgr implements ClinicaMgt {

    public ClinicaMgr() {
        // TODO
    }

    @Override
    public void registrarPaciente(String cedula, String nombre, String telefono)
            throws PacienteYaExiste {
        // TODO
    }

    @Override
    public void solicitarTurno(String cedula, String especialidad)
            throws PacienteNoExiste {
        // TODO
    }

    @Override
    public Turno llamarProximoPaciente()
            throws NoHayPacientesEsperando {
        Turno t = new Turno("a", new Paciente("2", "2", "2"), "w");
        return null;
    }

    @Override
    public Turno atenderProximoTurno()
            throws NoHayTurnosPendientes {
        // TODO
        return null;
    }

    @Override
    public void cerrarTurno(Turno turno, String resolucion) {
        // TODO
    }

    @Override
    public Turno consultarTurnoAtendido(String idTurno) {
        // TODO
        return null;
    }

    @Override
    public Turno buscarTurnoPendiente(String idTurno) {
        Turno encontrado = null;
        // TODO
        return encontrado;
    }

    @Override
    public void mostrarHistorial() {
        // TODO
    }


}
