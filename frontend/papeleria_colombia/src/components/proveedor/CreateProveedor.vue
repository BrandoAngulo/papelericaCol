<template>
    <div class="container">
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Datos de Proveedor</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"
                            id="myModal"></button>
                    </div>
                    <div class="modal-body">

                        <form @submit.prevent="guardar">
                            <div class="mb-3">
                                <label for="id_proveedor" class="form-label">id</label>
                                <input type="number" name="id_proveedor" class="form-control"
                                    id_proveedor="id_proveedor" aria-describedby="emailHelp"
                                    v-model.trim="proveedor.id_proveedor">
                            </div>
                            <div class="mb-3">
                                <label for="nit" class="form-label">Nit</label>
                                <input type="date" class="form-control" id="nit" v-model.trim="proveedor.nit">
                            </div>
                            <div class="mb-3">
                                <label for="nombre" class="form-label">Nombre</label>
                                <input type="text" class="form-control" id="nombre" v-model.trim="proveedor.nombre">
                            </div>
                            <div class="mb-3">
                                <label for="direccion" class="form-label">Direccion</label>
                                <input type="text" class="form-control" id="direccion"
                                    v-model.trim="proveedor.direccion">
                            </div>
                            <div class="mb-3">
                                <label for="celular" class="form-label">Celular</label>
                                <input type="number" class="form-control" id="celular" v-model.trim="proveedor.celular">
                            </div>
                            <div class="mb-3">
                                <label for="estado" class="form-label">Estado</label>
                                <input type="text" class="form-control" id="estado" v-model.trim="proveedor.estado">
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
    name: "CreateProveedor",
    data: () => {
        return {
            proveedor: {
                id_proveedor: "",
                nit: "",
                nombre: "",
                direccion: "",
                celular: "",
                estado: ""
            },
        };
    },
    methods: {
        guardar() {
            axios
                .post("http://localhost:3000/api/proveedor", this.proveedor)
                .then((data) => {
                    console.log('res', data);
                    this.$emit('refresh');
                    this.$swal.fire({
                        "title": "Guardado",
                        "text": "Usuario agregado exitosamente",
                        "icon": "success",
                        "confirmButtonText": "OK!",
                    }),
                        console.log(this.proveedor)
                })
        }
    }
};
</script>