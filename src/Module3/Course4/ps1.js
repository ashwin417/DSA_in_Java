const companies = [
    {
        companyName: "ABCD",
        location: "Mangalam",
        employees: 120
    },
    {
        companyName: "Banana Solutions",
        location: "South Bengal",
        employees: 85
    }
];

const jsonString = JSON.stringify(companies);

console.log(jsonString);


// Output:
// [{"companyName":"ABCD","location":"Mangalam","employees":120},{"companyName":"Banana Solutions","location":"South Bengal","employees":85}]
