<template>
    <div class="main">        
        <a href="#main" class="skip">Hopp til hovedinnhold</a>
        <h1>Sandra's Univers</h1>
    </div>
</template>

<script>
</script>

<style scoped>
    .main {        
        background-image: url("https://cdn.mos.cms.futurecdn.net/jbCNvTM4gwr2qV8X8fW3ZB-970-80.png.webp"); /* The image used */
        background-color: #cccccc; /* Used if the image is unavailable */
        height: 32rem; /* You must set a specified height */
        background-position: center; /* Center the image */
        background-repeat: no-repeat; /* Do not repeat the image */
        background-size: cover; /* Resize the background image to cover the entire container */
    }    

    h1 {        
        margin-top: 0;
        position: relative;
        top: 45%;
        background: rgba(0, 0, 0, 0.60);
        color: white;
        font-size: 5rem;
        text-align: center;
        
    }

    .skip {
        position: absolute;
        left: -10000px;
        top: auto;width: 1px;
        height: 1px;
        overflow: hidden;

        font-size: 1.5rem;
        background-color: red;
        color: black;
        padding: .5rem;
    }

    .skip:focus {
        position: static;
        width: auto;
        height: auto;
    }
</style>
