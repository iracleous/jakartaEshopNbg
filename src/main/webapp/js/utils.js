var url = "http://localhost:8080/NbgEshop/api/product";

function CreateProduct() {

    document.getElementById("resultDiv").innerHTML = '';

    var method = "POST";
    var data = {
        name: document.getElementById("name").value,
        price: Number(document.getElementById("price").value),
        category: document.getElementById("category").value
    };

    fetch(url, {
        method: method, // *GET, POST, PUT, DELETE, etc.
        mode: "cors", // no-cors, *cors, same-origin
        cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
        credentials: "same-origin", // include, *same-origin, omit
        headers: {
            "Content-Type": "application/json",
            // 'Content-Type': 'application/x-www-form-urlencoded',
        },
        redirect: "follow", // manual, *follow, error
        referrerPolicy: "no-referrer", // no-referrer, *no-referrer-when-downgrade, origin, origin-when-cross-origin, same-origin, strict-origin, strict-origin-when-cross-origin, unsafe-url
        body: JSON.stringify(data), // body data type must match "Content-Type" header
    })
        .then(res => res.json())
        .then(d => {
            //	document.getElementById("resultDiv").innerHTML = JSON.stringify(d);
            document.getElementById("resultDiv").innerHTML = "name= " + d.name + " id= " + d.id + " price= " + d.price;
        })
        .catch(error => {
            if (error instanceof TypeError && error.message.includes('API key')) {
                console.error('Invalid API key:', error);
                document.getElementById("resultDiv").innerHTML = 'Invalid API key:' + error;
            } else {
                console.error('There was a problem with the Fetch operation:', error);
                document.getElementById("resultDiv").innerHTML = 'here was a problem with the Fetch operation:';
            }
        });
}