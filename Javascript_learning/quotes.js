const quotes = [
    {
        quote : "Hate the sin, love the sinner."
    },
    {
        quote : "Love is merely madness."
    },
    {
        quote : "Love is the triumph of imagination over intelligence."
    },
    {
        quote : "There is no remedy for love but to love more."
    },
    {
        quote : "Intense love does not measure, it just gives."
    },
    {
        quote : "True love brings up everything - you're allowing a mirror to be held up to you daily."
    },
    {
        quote : "Never pretend to a love which you do not actually feel, for love is not ours to command."
    },
    {
        quote : "Life's greatest happiness is to be convinced we are loved."
    },
    {
        quote : "Love is an irresistible desire to be irresistibly desired."
    },
    {
        quote : "There's a lot to be said for self-delusionment when it comes to matters of the heart."
    },
    {
        quote : "What is done out of love always takes place beyond good and evil."
    },
    {
        quote : "To love and be loved is to feel the sun from both sides."
    }
];

const quoteID = document.querySelector("#quote span:first-child");

const todaysQuote = quotes[Math.floor(Math.random()* quotes.length)];
quoteID.innerText = todaysQuote.quote;