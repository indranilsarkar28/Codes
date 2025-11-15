from flask import Flask, request, jsonify
import google.generativeai as genai

app = Flask(__name__)

# Configure Gemini (better to load from environment variable later)
genai.configure(api_key="AIzaSyABs3D46oI4d7rJBFXrtZC3i6EsQl1C79k")

@app.route("/ask", methods=["POST"])
def ask_ai():
    data = request.json
    prompt = data.get("prompt", "")
    try:
        model = genai.GenerativeModel("gemini-1.5-flash")
        response = model.generate_content(prompt)
        return jsonify({"reply": response.text})
    except Exception as e:
        return jsonify({"error": str(e)}), 500

if __name__ == "__main__":
    app.run(debug=True)
