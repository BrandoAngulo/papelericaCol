<template>
  <div class="d-grid gap-2 col-3 mt-4">
    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
      Crear usuario
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
          <th scope="col">Nombre</th>
          <th scope="col">Fecha de nacimiento</th>
          <th scope="col">Direccion</th>
          <th scope="col">Cedula</th>
          <th scope="col">Celular</th>
          <th scope="col">Correo</th>
           <th scope="col">Ciudad</th> 
          <th scope="col">Password</th>
          <th scope="col">Estado</th>
           <th scope="col">Rol</th> 
          <th colspan="2" scope="col">Opcion</th>
        </tr>
      </thead>
      <tbody class="table-group-divider">
        <tr v-for="usuario in usuarios" :key="usuario.id">
          <th scope="row">{{ usuario.id }}</th>
          <td>{{ usuario.nombre }}</td>
          <td>{{ usuario.fecha_nacimiento }}</td>
          <td>{{ usuario.direccion }}</td>
          <td>{{ usuario.cedula }}</td>
          <td>{{ usuario.celular }}</td>
          <td>{{ usuario.correo }}</td>
           <td>{{ usuario.id_ciudad.nombre }}</td> 
          <td>{{ usuario.pass }}</td>
          <td>{{ usuario.estado }}</td>
           <td>{{ usuario.id_roles.descripcion }}</td> 
          <td> <button type="button" class="btn btn-danger" @click="eliminar(usuario.id)">Eliminar </button></td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
  
<script>
import axios from 'axios';

export default {
  name: "ListarUser",
  props: {
    usuarios: {
      type: Array,
    },
  },
  methods: {
    eliminar(id) {
      axios
        .delete('http://localhost:3000/api/usuario/' + id)
        .then((data) => {
          console.log('res', data);
          this.$swal.fire({
            "title":"Eliminado!",
            "text":"Usuario Eliminado Exitosamente",
            "icon":"success",
            "confirmButtonText":"OK!",
          })
        })
      /* .catch(() => {
        alert("Usuario eliminado satisfactoriamente");
      });  */
      console.log(id);
    },

  },
};
</script>


