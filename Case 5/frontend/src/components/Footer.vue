<template>
    <div class="footer">
        <div id="company-info">
            <p>Org nr: 133 7133 7133</p>
            <p>Adresse: Anonsgate 25c, 0101, Oslo</p>
        </div>
        <div id="contact">
            <p>vaskeriet@gmail.com</p>
            <p>telefon 07070707</p>
        </div>
        <div id="social-media">
            <i class="fa fa-facebook-square"></i>
            <i class="fa fa-twitter-square"></i>
            <i class="fa fa-youtube-square"></i>
            <i class="fa fa-snapchat-ghost"></i>
            <i class="fa fa-tumblr"></i>
        </div>
    </div>
</template>

<script>
export default {}
</script>
<style scoped>
.footer {
    background-color: #448AFF;
    position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;
    text-align: center;
    color: white;
    display: flex;
    justify-content: space-around;
}

#company-info {
    flex-direction: row;
    margin-left:2rem;
    padding:0rem;
    text-align: left;
}

#social-media {
    flex-direction: row;
    margin-right:2rem;
}

#contact {
    flex-direction: row;
}

.fa {
  padding: 1rem;
  font-size: 2rem;
  width: 3rem;
  text-align: center;
  text-decoration: none;
  margin: 0rem .25rem;
  position: relative;
  top: .5rem;
}

</style>
