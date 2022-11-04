<template>
    <div class="d-grid gap-2 col-3 mt-4">
      <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
        Crear Factura
        <span>
          <font-awesome-icon icon="fa-solid fa-user-plus" />
        </span>
      </button>
  
    </div>
    <div class="container">
      <table class="table; table table-hover">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">cliente</th>
            <th scope="col">cantidad</th>
            <th scope="col">fecha</th>
            <th scope="col">tipo de pago</th>
            <th scope="col">total</th>
            <th scope="col">prducto</th>
            <th colspan="2" scope="col">Opcion</th>
          </tr>
        </thead>
        <tbody class="table-group-divider">
          <tr v-for="venta in ventas" :key="venta.id_ventas">
            <th scope="row">{{ venta.id_ventas }}</th>
            <td>{{ venta.id_cliente.id_usuario.nombre }}</td>
            <td>{{ venta.cantidad }}</td>
            <td>{{ venta.fecha }}</td>
            <td>{{ venta.tipo_pago }}</td>
            <td>{{ venta.valor_total }}</td>
            <td>{{ venta.id_producto.nombre }}</td>
            <td> <button type="button" class="btn btn-danger" @click="eliminar(venta.id_ventas)">Eliminar </button></td>
          </tr>
        </tbody>
      </table>
    </div>
  </template>
    
  <script>
  import axios from 'axios';
  
  export default {
    name: "ListarVentas",
    props: {
      ventas: {
        type: Array,
      },
    },
    methods: {
      eliminar(id_ventas) {
        axios
          .delete('http://localhost:3000/api/ventas/' + id_ventas)
          .then((data) => {
            console.log('res', data);
            this.$swal.fire({
              "title":"Eliminado!",
              "text":"Venta Eliminada Exitosamente",
              "icon":"success",
              "confirmButtonText":"OK!",
            })
          })
        console.log(id_ventas);
      },
    },
  };
  </script>
  
  
  