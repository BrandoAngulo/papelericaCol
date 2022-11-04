<template>
    <div>
        <ListarCategoria :categorias="categorias"/>
        <CreateCategoria @refresh="refresh"/>
    </div>
</template>

<script>
import CreateCategoria from '@/components/categoria/CreateCategoria.vue';
import ListarCategoria from '@/components/categoria/ListarCategoria.vue';
import axios from 'axios';
export default {
    name:"cate-goria",
    components:{ListarCategoria,CreateCategoria},
data:()=>({
    categorias:[]
}),
mounted(){
    this.getCategoria();
},
methods:{
    refresh(){
        this.getCategoria();        
    },

    getCategoria(){
        axios
        .get("http://localhost:3000/api/categoria/listar")
        .then((res)=>{
            this.categorias=res.data;
            console.log(this.categorias);
        })
    }
}
}
</script>