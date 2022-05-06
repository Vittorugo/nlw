import axios from 'axios';

export const api = axios.create({
    
    baseURL: import.meta.env.VITE_API_URL, //Import da variável de ambiente feito pelo Vite
    //baseURL: 'http://localhost:8080',  //Endereço base do backend
});