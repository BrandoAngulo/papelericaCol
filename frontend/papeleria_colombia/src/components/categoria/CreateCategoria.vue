<template>
<div>

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
                                <label for="id_categoria" class="form-label">id_categoria</label>
                                <input type="number" name="id_categoria" class="form-control" id="id_categoria"
                                    aria-describedby="emailHelp" v-model.trim="categoria.id_categoria">
                                <div id="id" class="form-text">Ingrese el id_categoria</div>
                            </div>
                            <div class="mb-3">
                                <label for="descripcion" class="form-label">Descripcion</label>
                                <input type="text" class="form-control" id="descripcion" v-model.trim="categoria.descripcion">
                            </div>
                            <div class="mb-3">
                                <label for="nombre" class="form-label">Nombre</label>
                                <input type="text" class="form-control" id="Nombre" v-model.trim="categoria.nombre">
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
</div>

</template>

<script>
import axios from 'axios';

export default {
    name:"CreateCategoria",
    data:()=>{
        return{
         categoria:{
            id_categoria:"",
            descripcion:"",
            nombre:"",                        
         }   
        } 
    },
    methods:{
        guardar(){
            axios
            .post("http://localhost:3000/api/categoria",this.categoria)
            .then ((data)=>{
                console.log(data)
                this.$emit("refresh")
            })
        }
    }
}
</script>