<template>
    <div>
        <div class="container">
            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5" id="exampleModalLabel">Factura</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"
                                id="myModal"></button>
                        </div>
                        <div class="modal-body">

                            <form @submit.prevent="guardar">
                                <div class="mb-3">
                                    <label for="id_ventas" class="form-label">id venta</label>
                                    <input type="number" name="id_ventas" class="form-control" id="id_ventas"
                                        aria-describedby="emailHelp" v-model.trim="venta.id_ventas">
                                    <div id="id" class="form-text">Ingrese el id</div>
                                </div>
                                <div class="mb-3">
                                    <label for="id_clientes" class="form-label">id Cliente</label>
                                    <input type="number" name="id_clientes" class="form-control" id="id_clientes"
                                        aria-describedby="emailHelp" v-model.trim="venta.id_cliente">
                                    <div id="id" class="form-text">Ingrese el id</div>
                                </div>

                                <div class="mb-3">
                                    <label for="cantidad" class="form-label">Cantidad</label>
                                    <input type="number" class="form-control" id="Cantidad"
                                        v-model.trim="venta.cantidad">
                                </div>
                                <div class="mb-3">
                                    <label for="fecha" class="form-label">Fecha </label>
                                    <input type="date" class="form-control" id="fecha" v-model.trim="venta.fecha">
                                </div>
                                <div class="mb-3">
                                    <label for="tipo pago" class="form-label">Tipo Pago</label>
                                    <input type="text" class="form-control" id="tipo_pago"
                                        v-model.trim="venta.tipo_pago">
                                </div>
                                <div class="mb-3">
                                    <label for="valor total" class="form-label">Valor Total</label>
                                    <input type="number" class="form-control" id="valor_total"
                                        v-model.trim="venta.valor_total">
                                </div>
                                <div class="mb-3">
                                    <label for="correo" class="form-label">Id producto</label>
                                    <input type="number" class="form-control" id="id_producto"
                                        v-model.trim="venta.id_prducto">
                                </div>
                                <select class="form-select" aria-label="Default select example">
                                    <option selected>Open this select menu</option>
                                    <option value="1">One</option>
                                    <option value="2">Two</option>
                                    <option value="3">Three</option>
                                </select>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary"
                                        data-bs-dismiss="modal">Cancelar</button>
                                    <button type="submit" data-bs-dismiss="modal"
                                        class="btn btn-success">Guardar</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import axios from "axios";

export default {
    name: "CreateVentas",
    data: function () {
        return {
            venta: {
                id_ventas: "",
                id_cliente: "",
                cantidad: "",
                fecha: "",
                tipo_pago: "",
                valor_total: "",
                id_prducto: "",
            },
        };
    },
    methods: {

        guardar() {
            axios
                .post('http://localhost:3000/api/ventas', this.venta)
                .then((data) => {
                    'res', data
                    this.$emit("refresh");
                    this.$swal("Venta agregada exitosamente")
                });
            console.log(this.venta);
        },
    },
};
</script>