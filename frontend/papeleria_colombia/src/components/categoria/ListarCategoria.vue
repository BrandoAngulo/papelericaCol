<template>
    <div class="d-grid gap-2 col-3 mt-4">
      <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
        Crear categoria
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
            <th scope="col">descripcion</th>
            <th scope="col">Nombre</th>
            <th colspan="2" scope="col">Opcion</th>
          </tr>
        </thead>
        <tbody class="table-group-divider">
          <tr v-for="categoria in categorias" :key="categoria.id_categoria">
            <th scope="row" >{{ categoria.id_categoria }}</th>
            <td>{{ categoria.id_categoria }}</td>
            <td>{{ categoria.descripcion }}</td>
            <td>{{ categoria.nombre }}</td>
            <td> <button type="button" class="btn btn-danger" @click="eliminar(categoria.id_categoria)">Eliminar </button> <button type="button"
                class="btn btn-success"> Editar</button></td>
          </tr>
        </tbody>
      </table>
    </div>
  </template>
    
  <script>
  import axios from 'axios';
  
  export default {
    name: "ListarCategoria",
    props: {
      categorias: {
        type: Array,
      },
    },
    methods: {
      eliminar(id_categoria) {
        axios
          .delete('http://localhost:3000/api/categoria/' + id_categoria)
          .then((data) => {
            console.log('res', data);
          })
        /* .catch(() => {
          alert("Usuario eliminado satisfactoriamente");
        });  */
        console.log(id_categoria);
      },
  
    },
  };
  </script>