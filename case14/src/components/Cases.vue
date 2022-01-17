<template>
    <div class="main">
        <h2>Saker</h2>
        <div class="cases">
            <div class="case" v-for="item in items" :key="item.message">
                <img alt="" :src="item.imgSrc">
                <div class="case-info">
                    <h3>{{item.heading}}</h3>
                    <p class="case-info-ingress">{{item.ingress}}</p>
                    <a :href="item.linkHref">{{item.linkText}}</a>
                </div>
            </div>
        </div>
        <button v-on:click="viewMore">Se flere saker +</button> <!-- TODO: -->
    </div>
</template>

<script>
export default {
  name: 'Cases',
  data: () => ({
    items: [
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },{
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },{
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
        {
            imgSrc: 'https://previews.123rf.com/images/ximagination/ximagination1912/ximagination191200366/135470812-portrait-of-an-asian-kids-constructing-and-programming-a-robot-while-studying-it-in-a-classroom.jpg',
            heading: 'Ut varius tincidunt',
            ingress: 'Etiam sit amet orci eget eros faucibus tincidunt. Phasellus magna. Phasellus accumsan cursus velit. Proin magna. Sed in libero ut nibh placerat accumsan.',
            linkHref: 'google.com',
            linkText: 'Praesent vestibulum dapibus nibh.',
        },
    ],
  }),
  methods: {
    viewMore: function () {
        console.log("Se flere saker +");
    }
  }
}
</script>

<style scoped>
    @media only screen and (min-width: 1025px) {
        .main {
            margin: 0 20% 0 20%;
        }

        .cases {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }

        .case {
            width: 15rem;
        }

        h2 {
            text-align: left !important;
        }

        .case-info {
            margin-left: 0 !important;            
        }

        h3 {
            margin-top: .5rem;
            margin-bottom: .5rem;
        }

        .case-info-ingress {
            margin-top: 0;
            margin-bottom: .5rem;
        }

        button {            
            margin-left: 0 !important;
        }
    }

    .main {
        margin-top: 2.5rem;
        padding-bottom: 5rem;
    }    

    .case {        
        margin-bottom: 2rem;
    }

    .case-info {
        margin-left: .5rem;
        margin-right: .5rem;
    }

    img {
        width: 100%;
    }

    button {
        font-weight: bold;
        color: rgb(63, 168, 168);
        background-color: white;
        border: .1rem solid gray;
        border-radius: 6%;
        padding: .5rem;
        margin-left: .5rem;
    }

    button:hover {
        color: rgb(41, 107, 107);
        background-color: rgb(226, 226, 226);
        border: .1rem solid rgb(94, 94, 94);
    }

    button:active {
        color: rgb(63, 168, 168);
        background-color: white;
        border: .1rem solid gray;
    }

    h2 {
        text-align: center;
    }
</style>