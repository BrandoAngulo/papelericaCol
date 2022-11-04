import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
//importar bootstrap
import '../node_modules/bootstrap/dist/css/bootstrap.css'
import Bootstrap from "bootstrap/dist/js/bootstrap.bundle.js";
/**libreria fontAsome */
import { library } from '@fortawesome/fontawesome-svg-core'
/**Alertas con sweetAlert2 */
import VueSweetalert2 from 'vue-sweetalert2';
import 'sweetalert2/dist/sweetalert2.min.css';


/* import font awesome icon component */
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
/* import specific icons */
import { faCamera, faUser, faUserPlus, faUserSecret, faUserXmark } from '@fortawesome/free-solid-svg-icons'
/* add icons to the library */
library.add(faUserSecret,faUser,faUserPlus,faUserXmark,faCamera)


createApp(App).use(store).use(Bootstrap).use(VueSweetalert2).component('font-awesome-icon', FontAwesomeIcon).use(router).mount('#app')
