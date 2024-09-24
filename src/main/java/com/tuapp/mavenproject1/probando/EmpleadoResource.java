package com.tuapp.mavenproject1.probando;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
//thisssssssssss

@Path("/empleados")
public class EmpleadoResource {
    private EmpleadoService servicio = new EmpleadoService();

    @GET
    @Path("/{codigo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerEmpleado(@PathParam("codigo") int codigo) {
        Empleado empleado = servicio.obtenerEmpleadoPorCodigo(codigo);
        if (empleado != null) {
            return Response.ok(empleado).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Empleado no encontrado").build();
        }
    }
}
