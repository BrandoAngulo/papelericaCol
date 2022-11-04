<template>
    <div class="container">
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"
                            id="myModal"></button>
                    </div>
                    <div class="modal-body">

                        <form @submit.prevent="guardar">
                            <div class="mb-3">
                                <label for="id" class="form-label">id</label>
                                <input type="number" name="id" class="form-control" id="id" aria-describedby="emailHelp"
                                    v-model.trim="usuario.id">
                                <div id="id" class="form-text">Ingrese el id</div>
                            </div>
                            <div class="mb-3">
                                <label for="nombre" class="form-label">Nombre</label>
                                <input type="text" class="form-control" id="nombre" v-model.trim="usuario.nombre">
                            </div>
                            <div class="mb-3">
                                <label for="fecha_nacimiento" class="form-label">Fecha de nacimiento</label>
                                <input type="date" class="form-control" id="fecha_nacimiento"
                                    v-model.trim="usuario.fecha_nacimiento">
                            </div>
                            <div class="mb-3">
                                <label for="direccion" class="form-label">Direccion</label>
                                <input type="text" class="form-control" id="direccion" v-model.trim="usuario.direccion">
                            </div>
                            <div class="mb-3">
                                <label for="cedula" class="form-label">Cedula</label>
                                <input type="number" class="form-control" id="cedula" v-model.trim="usuario.cedula">
                            </div>
                            <div class="mb-3">
                                <label for="celular" class="form-label">Celular</label>
                                <input type="number" class="form-control" id="celular" v-model.trim="usuario.celular">
                            </div>
                            <div class="mb-3">
                                <label for="correo" class="form-label">Correo</label>
                                <input type="email" class="form-control" id="correo" v-model.trim="usuario.correo">
                            </div>
                            <div class="form-floating">
                                <select class="form-select" id="floatingSelect"
                                    aria-label="Floating label select example" v-model="usuario.ciudad">
                                    <option disabled selected>seleciona la ciudad</option>
                                    <option value=1>Bogota</option>
                                    <option value=2>Cali</option>
                                </select>
                                <label for="floatingSelect">la ciudad</label>
                            </div>
                            <div class="mb-3">
                                <label for="pass" class="form-label">Contraseña</label>
                                <input type="password" class="form-control" id="pass" v-model.trim="usuario.pass">
                            </div>
                            <div class="mb-3">
                                <label for="estado" class="form-label">Estado</label>
                                <input type="text" class="form-control" id="estado" v-model.trim="usuario.estado">
                            </div>
                            <div class="form-floating">
                                <select class="form-select" id="floatingSelect"
                                    aria-label="Floating label select example" v-model="usuario.id_roles">
                                    <option disabled selected>seleciona un rol</option>
                                    <option value=1>Admin</option>
                                    <option value=2>Cliente</option>
                                    <option value=3>Vendedor</option>
                                </select>
                                <label for="floatingSelect">seleciona un rol</label>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary"
                                    data-bs-dismiss="modal">Cancelar</button>
                                <button type="submit" data-bs-dismiss="modal" class="btn btn-success">Guardar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import axios from "axios";

export default {
    name: "CreateUser",
    data: () => {
        return {
            usuario: {
                id: "",
                nombre: "",
                fecha_nacimiento: "",
                direccion: "",
                cedula: "",
                celular: "",
                correo: "",
                id_ciudad: "",
                pass: "",
                estado: "",
                id_roles: ""
            },
        };
    },
    methods: {
        guardar() {
            axios
                .post('http://localhost:3000/api/usuario/', this.usuario)
                .then((data) => {
                    'res', data
                    this.$emit("refresh");
                    this.$swal("Usuario agregado exitosamente")
                });
            console.log(this.usuario);
        },

    },
};
</script>