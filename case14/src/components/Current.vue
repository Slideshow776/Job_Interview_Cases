<template>
    <div class="main" id="main">
        <h2>Aktuelt</h2>
        <div class="content">
            <img alt="" src="https://expertreviews.b-cdn.net/sites/expertreviews/files/2020/09/best_laptop_for_kids_lifestyle.jpg">
            <div class="info">
                <h3>Programmering</h3>
                <p class="class">Trinn 11.-13.</p>
                <p>
                    Fusce convallis metus id felis luctus adipiscing. Fusce neque. Nam at tortor in tellus interdum sagittis.
                    Cras dapibus. Pellentesque libero tortor, tincidunt et, tincidunt eget, semper nec, quam. Ut tincidunt tincidunt erat.
                </p>
                <a href="google.com" >Phasellus dolor. Nam quam nunc, blandit vel.</a>
            </div>
        </div>
    </div>
</template>

<script>
</script>

<style scoped>
    @media only screen and (min-width: 1025px) {
        .main {
            margin: 0 20% 0 20%;
        }    

        .content {        
            display: flex;
            width: 100%;
        }

        img {
            max-width: 75%;
            margin-right: 1rem;
            object-fit: cover;
        }

        h2 {
            text-align: left !important;
        }

        h3 {            
            margin-top: 0;
            padding-top: 0;
        }
    }

    .main {
        margin-top: 2.5rem;        
    }

    img {
        width: 100%;
    }

    .info {
        margin-left: .5rem;
        margin-right: .5rem;
    }

    .class {
        background-color: rgb(187, 238, 238);
        widows: 5%;
        display: inline-block;
        padding: .2rem;
        margin: 0rem;
    }

    h2 {
        text-align: center;
    }
</style>
