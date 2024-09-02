const orders = [
    {
        name: "Order 1",
        description: "Description for Order 1",
        date: "2024-09-01",
        status: "Shipped"
    },
    {
        name: "Order 2",
        description: "Description for Order 2",
        date: "2024-09-02",
        status: "Pending"
    },
    {
        name: "Order 3",
        description: "Description for Order 3",
        date: "2024-09-03",
        status: "Delivered"
    }
];

const transformedOrders = orders.map(order => ({
    orderName: order.name,
    orderDetails: `${order.description} (Date: ${order.date}, Status: ${order.status})`
}));

console.log(transformedOrders);


// Output:
// [
//     {
//         orderName: 'Order 1',
//         orderDetails: 'Description for Order 1 (Date: 2024-09-01, Status: Shipped)'
//     },
//     {
//         orderName: 'Order 2',
//         orderDetails: 'Description for Order 2 (Date: 2024-09-02, Status: Pending)'
//     },
//     {
//         orderName: 'Order 3',
//         orderDetails: 'Description for Order 3 (Date: 2024-09-03, Status: Delivered)'
//     }
// ]

