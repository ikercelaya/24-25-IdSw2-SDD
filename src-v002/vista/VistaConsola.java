package vista;

import modelo.*;
import java.util.List;

public class VistaConsola {
    public void mostrarMenu() {
        System.out.println("\n--- GESTIÓN DEL RESTAURANTE ---");
        System.out.println("1. Agregar mesa");
        System.out.println("2. Registrar reserva");
        System.out.println("3. Realizar pedido");
        System.out.println("4. Mostrar mesas");
        System.out.println("5. Mostrar reservas");
        System.out.println("6. Mostrar pedidos");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarMesas(List<Mesa> mesas) {
        System.out.println("\n--- LISTA DE MESAS ---");
        if (mesas.isEmpty()) {
            System.out.println("⚠️ No hay mesas registradas.");
        } else {
            for (Mesa mesa : mesas) {
                System.out.println(mesa);
            }
        }
    }

    public void mostrarReservas(List<Reserva> reservas) {
        System.out.println("\n--- LISTA DE RESERVAS ---");
        if (reservas.isEmpty()) {
            System.out.println("⚠️ No hay reservas registradas.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }

    public void mostrarPedidos(List<Pedido> pedidos) {
        System.out.println("\n--- LISTA DE PEDIDOS ---");
        if (pedidos.isEmpty()) {
            System.out.println("⚠️ No hay pedidos registrados.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }
}
