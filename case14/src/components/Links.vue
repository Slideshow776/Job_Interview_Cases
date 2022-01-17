<template>
    <div class="main">
        <div class="content">
            <h2>Nyttige lenker</h2>

            <button class="accordion">Lokus: digitale læremidler</button>
            <div class="panel">
                <a href="google.com">Nam adipiscing</a>
                <a href="google.com">Curabitur ligula</a>
                <a href="google.com">Vivamus euismod</a>
            </div>
            <hr>

            <button class="accordion">Nettbutikk - kjøp læremidler</button>
            <div class="panel">
                <a href="google.com">Maecenas vestibulum</a>
                <a href="google.com">Morbi mattis</a>
                <a href="google.com">Vivamus euismod</a>
            </div>
            <hr>

            <button class="accordion">Lorum Ipsum</button>
            <div class="panel">
                <a href="google.com">Donec quam</a>
                <a href="google.com">Maecenas vestibulum</a>
                <a href="google.com">Nunc nec</a>
            </div>
            <hr>
        </div>
    </div>
</template>

<script>
export default {
    name: 'Links',
        mounted() {
            this.$nextTick(function () {
                // Code that will run only after the
                // entire view has been rendered

                var acc = document.getElementsByClassName("accordion");
                var i;

                for (i = 0; i < acc.length; i++) {
                acc[i].addEventListener("click", function() {
                    this.classList.toggle("active");
                    var panel = this.nextElementSibling;
                    if (panel.style.display === "grid") {
                        panel.style.display = "none";
                    } else {
                        panel.style.display = "grid";
                    }
                });
                }
            })
        }   
}
</script>

<style scoped>
    @media only screen and (min-width: 1025px) {
        .content {
            margin: 0 20% 0 20%;
        }

        h2 {
            text-align: left !important;
        }
    }

    .main {        
        background-color: rgb(249, 255, 233);
        padding-bottom: 5rem;
    }

    .content {
        padding-top: 2.5rem;
    }

    h2 {
        text-align: center;
    }

    .accordion {
        background-color: rgba(238, 238, 238, 0);
        cursor: pointer;
        padding: 18px;
        width: 100%;
        border: none;
        text-align: left;
        outline: none;
        font-size: 15px;
        transition: 0.4s;
    }

    .active, .accordion:hover {
        background-color: rgb(175, 180, 163);
    }

    .accordion:after {
        content: '\02795'; /* Unicode character for "plus" sign (+) */
        font-size: 13px;
        color: #777;
        float: right;
        margin-left: 5px;
    }

    .active:after {
        content: "\2796"; /* Unicode character for "minus" sign (-) */
    }

    .panel {
        padding: 1rem;
        display: none;
        background-color: white;
        overflow: hidden;
    }

    a {
        margin: .5rem;
    }
</style>