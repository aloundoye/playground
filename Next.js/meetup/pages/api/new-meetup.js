import {MongoClient} from "mongodb";

// /api/new-meetup
async function handler(req, res) {
  if (req.method === "POST") {
    const data = req.body;

    const client = await MongoClient.connect(
      "mongodb+srv://<user>:<password>@<cluster>.mongodb.net/meetups?retryWrites=true&w=majority"
    );
    const db = client.db();

    const meetupsCollection = db.collection("meetups");
    const result = await meetupsCollection.insertOne(data);

    console.log(result);

    await client.close();

    res.status(201).json({
      message: "Meetups inserted",
    });
  }
}

export default handler;
