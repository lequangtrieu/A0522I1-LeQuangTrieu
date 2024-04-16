import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, Row, Col, Card } from 'react-bootstrap';
import '../HomePage/HomePage.css';
import img1 from '../../static/img/img1.jpg';
import img2 from '../../static/img/img2.jpg';
import img3 from '../../static/img/img3.jpg';
import img4 from '../../static/img/img4.jpg';
import img5 from '../../static/img/img5.jpg';
import img6 from '../../static/img/img6.webp';
import img7 from '../../static/img/img7.webp';
import img8 from '../../static/img/img8.jpg';
import img9 from '../../static/img/img9.jpg';

const HomePage = () => {
    const imagePaths = [
        img1, img2, img3, img4, img5, img6, img7, img8, img9
    ]

    const imgContent = [
        "Phong Suite huong bien",
        "Phong Studio huong bien",
        "Phong Deluxe huong bien",
        "Phong Suite huong bien",
        "Phong Studio huong bien",
        "Phong Deluxe huong bien",
        "Phong Suite huong bien",
        "Phong Studio huong bien",
        "Phong Deluxe huong bien",

    ]
    return (
        <Container>
            <h1 className="text-center mt-4 mb-4">Welcome to BI BEO Resort</h1>
            <Row>
                {imagePaths.map((imagePath, index) => (
                    <Col key={index} md={4}>
                        <Card className="card">
                            <Card.Img
                                variant="top"
                                src={imagePath}
                                className="card-img-top"
                                alt={`Image ${index + 1}`}
                            />
                            <Card.Body>
                                <Card.Text className="image-content">
                                    {imgContent[index]}
                                </Card.Text>
                            </Card.Body>
                        </Card>
                    </Col>
                ))}
            </Row>
        </Container>
    );
};

export default HomePage;
