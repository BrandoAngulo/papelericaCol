<template>
    <div>
        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
      Crear Proveedor
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
          <th scope="col">Nit</th>
          <th scope="col">Nombre</th>
          <th scope="col">Direccion</th>
          <th scope="col">Celular</th>
          <th scope="col">Estado</th>
          <th colspan="2" scope="col">Opcion</th>
        </tr>
      </thead>
      <tbody class="table-group-divider">
        <tr v-for="proveedor in proveedores" :key="proveedor.id_proveedor">
          <th scope="row">{{ proveedor.id_proveedor }}</th>
          <td>{{ proveedor.nit }}</td>
          <td>{{ proveedor.nombre }}</td>
          <td>{{ proveedor.direccion }}</td>
          <td>{{ proveedor.celular }}</td>
          <td>{{ proveedor.estado }}</td>
          <td> <button type="button" class="btn btn-danger" @click="eliminar(proveedor.id_proveedor)">Eliminar </button></td>
        </tr>
      </tbody>
    </table>
    </div>
</template>

<script>
import axios from 'axios';

export default {
    name:'ListarProveedor',
    props:{
        proveedores:{
            type: Array,
        }, 
    },

    methods: {
        eliminar(id_proveedor){
            axios
            .delete('http://localhost:3000/api/proveedor/' + id_proveedor)
            .then((data)=>{
                console.log('res',data)
                this.$swal.fire({
                    "title":"Eliminado",
                    "text":"Proveedor eliminado exitosamente",
                    "icon":"success",
                    "confirmBurttonText":"OK!",
            });
            })

            console.log(id_proveedor);
        }
    },

}
</script>